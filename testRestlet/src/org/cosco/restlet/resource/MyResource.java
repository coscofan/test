package org.cosco.restlet.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.restlet.data.Form;
import org.restlet.representation.Representation;

@Path("/")
public class MyResource{

	@GET
	@Path("{id}/json")
	@Produces("application/json")
	public String getjson(@PathParam("id") int id)
	{
		return String.valueOf(id);
	}
	
	@GET
	@Path("{id}/xml")
	@Produces("application/json")
	public String getxml(@PathParam("id") int id)
	{
		return String.valueOf(id);
	}
	
	@POST
	@Path("add")
	public String add(Representation entity)
	{
		Form form 		= new Form(entity);
		
		String name 	= form.getFirstValue("name");
		
		return name;
		
	}
	
}
