package yoo13;

import java.util.ArrayList;
import java.util.List;

public class Cours {
	private Integer Id;
	private String type;
	
	
	List<Mark> Mrk=new ArrayList<Mark>();
	public List<Mark> getMrk() {
		return Mrk;
	}
	public void setMrk(List<Mark> mrk) {
		Mrk = mrk;
	}
	Mark MarkObj = new Mark();
	
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
