package yoo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Student {
	private int id;
	private String name;
	List<Cours> Cou=new ArrayList<Cours>();
//	Cours coursObj = new Cours();
	Student(){
		Stack<String> stack = new Stack<String>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("pleas enter the Name Of Student:  ");
		String StuName = sc.next();
		stack.push(StuName);
		setName(StuName);
		System.out.println("pleas enter the ID Of Student:  ");
		int id=sc.nextInt();
		String id1=Integer.toString(id);
		stack.push(id1);
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
