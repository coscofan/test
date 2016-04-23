package org.cosco.restlet;

import org.cosco.restlet.application.RestJaxRsApplication;
import org.restlet.Component;
import org.restlet.data.Protocol;

public class RestJaxRsServer {

	public static void main(String[] args) throws Exception
	{
		Component component = new Component();
		component.getServers().add(Protocol.HTTP, 8082);
		component.getDefaultHost().attach(new RestJaxRsApplication(null));
		component.start();
		System.out.println("the restlet server start...");
	}
	
}
