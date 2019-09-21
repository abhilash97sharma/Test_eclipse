package package1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/Myclass")
public class MyClass1 {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String show(){
	//	return("<h1>Hello abhilash Sharma</h1>");
		return("Hello abhilash Sharma");
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String s(@QueryParam("i1") int i,@QueryParam("j1") int j){
		return("<h1>Sum is:"+(i+j)+"</h1>");
	}
}
