package com.vti.academy.DemoMavenProject.entity;

public class Department {

	private int id;
	private String name;
	
	public Department() {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Department{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
