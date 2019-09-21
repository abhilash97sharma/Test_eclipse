package package1;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("API3")
public class MyClass3 {
  
	@POST
	public StudentClass meth1(StudentClass s){
		StudentDAO s1=new StudentDAO();
		s1.addStudent(s);
		return s;
	}  //working fine with the post request with the type of application is XML
	
	@GET
	@Path("getall")
	@Produces(MediaType.APPLICATION_XML)
	public List<StudentClass> getAll1(){
		StudentDAO s2=new StudentDAO();
		return(s2.getAll());
	}
	
	@GET
	@Path("getall/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public StudentClass getsp(@PathParam("id") int id){
		StudentDAO s=new StudentDAO();
		return(s.filter(id));
	}
}
//This is working fine.
