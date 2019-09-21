package package1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentClass {

	int rollno;
	String name;
	String branch;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}	
	
}
