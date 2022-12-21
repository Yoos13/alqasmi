package yoo13;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private String Name;
	private Integer Id;
	private Integer NoOfCourses;
	List<Student> stu=new ArrayList<Student>();
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
