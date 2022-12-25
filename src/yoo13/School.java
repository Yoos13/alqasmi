package yoo13;
import java.util.*;
public class School {
	String name;
	int noOfsection;
	String location;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	


	List<Department> DepObj = new ArrayList<Department>();

	public List<Department> getDepObj() {
		return DepObj;
	}

	public void setDepObj(List<Department> depObj) {
		DepObj = depObj;
	}
	
}
