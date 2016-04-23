package testRestlet;

import javax.ws.rs.Path;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class test01 extends ServerResource{

	
	public static void main(String[] args)  throws Exception
	{
		new Server(Protocol.HTTP, 8080, test01.class).start();;
	}
	
	@Get
	@Path("01")
	public String toString()
	{
		return "hello world!!!";
	}
	
}
