package package1;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.*;
import au.com.bytecode.opencsv.CSVReader;

public class Json_Convert {
   public static void main(String[]args) throws JSONException{
	   JSONObject person = new JSONObject();
/*	   person.put("Name", "Abhilash");
	   person.put("age", 23);
	   System.out.println(person);*/
	   List<JSONObject> lstjson = new ArrayList<JSONObject>();
	   
	   String path = "C:/Users/Abhilash Sharma/Desktop/desktop3/R_notes/employee.csv";
	   try{
		   FileReader filereader = new FileReader(path);
		   CSVReader csvreader = new CSVReader(filereader);
		   List<String []> lst = csvreader.readAll();
		   Iterator<String[]> itr = lst.iterator();
		   String [] heading = null;
		   
		   if(itr.hasNext()){
			   heading = (String[])itr.next();
		   }
  
		   while(itr.hasNext()){
			   String []s1 = (String[])itr.next();
			   int i = 0;
	           for(String s : s1){
	        	   lstjson.add(person.put(heading[i++], s));
	           }
		   }
		   
		   System.out.println(lstjson);
		   csvreader.close();
	   }
	   catch(Exception e){
		   System.out.println("Some exception has occured");
	   }
   }
}
