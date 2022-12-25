package yoo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
	List<Teacher> TecherObj1 = new ArrayList<Teacher>();
	private String Name;
	private Integer NoOfDeps;
	private String NoOfTecher;
	
	Department(){
		Scanner sc = new Scanner(System.in);
		System.out.println("pleas enter the Name Of Department:  ");
		String Name = sc.next();
		setName(Name);
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Integer getNoOfDeps() {
		return NoOfDeps;
	}
	public void setNoOfDeps(int noOfDeps) {
		NoOfDeps = noOfDeps;
	}
	public String getNoOfTecher() {
		return NoOfTecher;
	}
	public void setNoOfTecher(String noOfTecher) {
		NoOfTecher = noOfTecher;
	}
	
	public List<Teacher> getTecherObj1() {
		return TecherObj1;
	}
	public void setTecherObj1(List<Teacher> techerObj1) {
		TecherObj1 = techerObj1;
	}
	
	Teacher tech=new Teacher();

	
}
