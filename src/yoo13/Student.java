package yoo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	List<Cours> Cou=new ArrayList<Cours>();
//	Cours coursObj = new Cours();
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("pleas enter the Name Of Student:  ");
		String StuName = sc.next();
		setName(StuName);
		System.out.println("pleas enter the ID Of Student:  ");
		int id=sc.nextInt();
		setId(id);
	}
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
