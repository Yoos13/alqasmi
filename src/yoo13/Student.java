package yoo13;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	List<Cours> Cou=new ArrayList<Cours>();
	Cours coursObj = new Cours();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



 
}
