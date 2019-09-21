package package1;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("API4")
public class MyClass4 {
	
  @POST
  public MaterialDetails addMat(MaterialDetails m1){
	  System.out.println(m1.toString());
	  return m1;
  }
  //working fine and returning the json object.
}
