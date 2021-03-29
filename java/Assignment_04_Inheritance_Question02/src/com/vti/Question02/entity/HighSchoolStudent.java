package com.vti.Question02.entity;

public class HighSchoolStudent extends Student{
	private int id;
	private String name;
	private String clazz;
	private String desiredUniversity;
	

	 public HighSchoolStudent() {
		}

		public HighSchoolStudent(String name1,int id1,int id,String name,String clazz,String desiredUniversity) {
			super(name1,id1);
			this.id = id;
			this.name=name;
			this.clazz=clazz;
			this.desiredUniversity=desiredUniversity;
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
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getDesiredUniversity() {
		return desiredUniversity;
	}
	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}
	
	
}

