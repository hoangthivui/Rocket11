package Collection.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int id;
	private String name;
	private static int count=0;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		count++;
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
	public String toString() {
		return "Student: id= " + getId() +", name= "+ getName()+ "\n";
	}

	
}
