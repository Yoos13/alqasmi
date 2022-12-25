package yoo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cours {
	private Integer Id;
	private String type;
	
	
	List<Mark> Mrk=new ArrayList<Mark>();
	Cours(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Pleas enter the Cours Name: ");
		String type=sc.next();
		setType(type);
		System.out.println("Pleas enter the Cours Id: ");
		Integer Id = sc.nextInt();
		setId(Id);
	}
	public List<Mark> getMrk() {
		return Mrk;
	}
	public void setMrk(List<Mark> mrk) {
		Mrk = mrk;
	}
//	Mark MarkObj = new Mark();
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id2) {
		Id = id2;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
