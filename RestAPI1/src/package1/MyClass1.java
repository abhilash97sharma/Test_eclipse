package package1;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/API1")
public class MyClass1 {
  
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<StudentClass> fun1(){
		List<StudentClass> li = new ArrayList<StudentClass>();
		
		StudentClass s1=new StudentClass();
		s1.setBranch("CSE");
		s1.setName("Abhi");
		s1.setRollno(101);
		
		StudentClass s2=new StudentClass();
		s2.setBranch("EC");
		s2.setName("Deepak");
		s2.setRollno(102);
		
		li.add(s1);
		li.add(s2);
		
		return(li);
	}
}
