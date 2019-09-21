package package1;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;

@Path("API2")
public class MyClass2 {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentClass> m2(){
		List <StudentClass> li = new ArrayList();
		StudentClass s1=new StudentClass();
		StudentClass s2=new StudentClass();
		s2.setRollno(102);
		s2.setName("Sonu");
		s2.setBranch("EC");
		s1.setRollno(101);
		s1.setName("Abhi Sharma");
		s1.setBranch("CSE");
		li.add(s1);
		li.add(s2);
		return(li);
	}

	@GET
	@Path("add1")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentClass> m3(){
		List <StudentClass> li = new ArrayList();
		StudentClass s1=new StudentClass();
		s1.setRollno(104);
		s1.setName("Ashu Sharma");
		s1.setBranch("ME");
		li.add(s1);
		return(li);
	}
	//working fine by giving both the resources.
}
