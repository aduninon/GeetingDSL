package org.xtext.example.mydsl.tests;

import org.thingml.xtext.ThingMLStandaloneSetup;

import com.google.inject.Injector;

public class DSLMyProvider extends MyDslInjectorProvider {
	@Override
	protected Injector internalCreateInjector() {
		ThingMLStandaloneSetup.doSetup();
		return super.internalCreateInjector();
	}
}
