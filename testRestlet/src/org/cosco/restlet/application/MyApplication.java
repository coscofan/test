package org.cosco.restlet.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.cosco.restlet.resource.MyResource;

public class MyApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		
		Set<Class<?>> resources		= new HashSet<Class<?>>();
		resources.add(MyResource.class);
		
		return resources;
	}

	
	
}
