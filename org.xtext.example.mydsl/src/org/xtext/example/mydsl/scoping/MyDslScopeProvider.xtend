/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.mydsl.scoping

import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.MyPort
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.mydsl.myDsl.MyObject

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractMyDslScopeProvider {
	val mydslInstance = MyDslPackage.eINSTANCE;
	protected ArrayList<EObject> EMPTY = new ArrayList();
	
	override IScope getScope(EObject context, EReference reference) { 
		if (reference == mydslInstance.myPort_Port) {
			return Scopes.scopeFor(Helpers.allPorts(context as MyPort))
		} else if (reference == mydslInstance.myPort_Object) {
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, MyObject)
			return Scopes.scopeFor(candidates)
		} else {
			System.err.println("ERROR !");
		}
		return Scopes.scopeFor(EMPTY);
	}
}
