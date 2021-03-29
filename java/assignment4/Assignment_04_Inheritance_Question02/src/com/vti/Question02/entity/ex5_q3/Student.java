package com.vti.Question02.entity.ex5_q3;

public abstract class Student extends Person{
 private String name1;
 private int id1;
 
 public Student() {
	}

	public Student(String name,int id) {
		super(name);
		this.name1 = name1;
		this.id1=id1;
	}
 

public String getName() {
	return name1;
}
public void setName(String name1) {
	this.name = name1;
}
public int getId() {
	return id1;
}
public void setId(int id1) {
	this.id1 = id1;
}
 
 
}
