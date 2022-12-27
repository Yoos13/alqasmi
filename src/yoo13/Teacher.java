package yoo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Teacher {
	private String Name;
	private Integer Id;
	private Integer NoOfCourses;
	List<Student> stu=new ArrayList<Student>();
//	Teacher(){
//		Stack<String> stack = new Stack<String>(); 
//		Scanner sc = new Scanner(System.in);
////		System.out.println("pleas enter the Name Of Techer:  ");
////		String Name1 = sc.next();
////		stack.push(Name1);
////		 setName(Name1);
//	    
//	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getNoOfCourses() {
		return NoOfCourses;
	}
	public void setNoOfCourses(Integer noOfCourses) {
		NoOfCourses = noOfCourses;
	}
	

	
}
