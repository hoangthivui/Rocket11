package com.vti.academy.backend;

public class Student_Exercise1 {
	private  int id;
	private  String name;
	public static String college="Đại học Bách Khoa";
	public static int moneyGroup=0;
	public static int counter = 0;
	public static final int maxStudent = 7;
	
	public Student_Exercise1(int id, String name) throws Exception {
		if (counter > maxStudent) {
			throw new Exception("Không thể tạo quá 7 sinh viên");
		}
		this.id = ++counter;
		this.name = name;
		moneyGroup=100;
		
	}
	public static int getmoneyGroup() {
		return moneyGroup;
	}
	public static void spend(int money) {
		Student_Exercise1.moneyGroup -= money;
	}
	public String toString() {
		return "student: id="+id+",name: "+name+" "+college;
	}
	public static void thayDoiCollege(String college) {
		Student_Exercise1.college = college;
	}
	
}
