package org.xtext.example.mydsl.scoping;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.thingml.xtext.ThingMLStandaloneSetup;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.ThingMLModel;
import org.xtext.example.mydsl.myDsl.MyObject;
import org.xtext.example.mydsl.myDsl.MyPort;

public class Helpers {
	public static ArrayList<Port> getAllPortsThing(MyObject thingToInstanciate) {
		ThingMLModel thingmlModel;
		ArrayList<Port> result = new ArrayList<Port>();
		thingmlModel = getThingInThingML(thingToInstanciate);
		if (thingmlModel != null)
			result = ThingMLHelpers.allPorts((org.thingml.xtext.thingML.Thing) thingmlModel.getTypes().get(0));
		return result;
	}
	
	public static ThingMLModel getThingInThingML(MyObject myObject) {
		URI new_uri = URI.createFileURI(myObject.getImportPath());
		ThingMLStandaloneSetup.doSetup();
		System.out.println("URI : " + new_uri);
		System.out.println("URI Resolve : " + myObject.eResource().getURI());
		if (new_uri.isRelative()) {
			new_uri = new_uri.resolve(myObject.eResource().getURI());
		}
		Resource r = myObject.eResource().getResourceSet().getResource(new_uri, true);
		if (r != null && r.getContents().size() > 0 && r.getContents().get(0) instanceof ThingMLModel) {
			return (ThingMLModel) r.getContents().get(0);
		} else {
			try {
				throw new Exception("No valid model found for resource " + myObject.getImportPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static ArrayList<Port> allPorts(MyPort myPort) {
		MyObject thingToInstanciate = myPort.getObject();
		ArrayList<Port> result = getAllPortsThing(thingToInstanciate);
		return result;
	}
}
