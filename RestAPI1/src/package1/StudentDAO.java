package package1;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	List<StudentClass> li=new ArrayList<StudentClass>();
	
	public StudentDAO(){
		StudentClass s1=new StudentClass();
		StudentClass s2=new StudentClass();
		s2.setRollno(103);
		s2.setName("Sonu Sharma");
		s2.setBranch("EC");
		s1.setRollno(104);
		s1.setName("Ankit Sharma");
		s1.setBranch("CE");
		li.add(s1);
		li.add(s2);
	}
	
	public void addStudent(StudentClass s1){
	  li.add(s1);	
	}

	public List<StudentClass> getAll(){
		return li;
	}
	
	public StudentClass filter(int id){
		for(StudentClass s:li){
			if(s.rollno==id)
				return s;
		}
		return null;
	}
}
