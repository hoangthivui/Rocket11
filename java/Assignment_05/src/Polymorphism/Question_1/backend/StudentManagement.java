package Polymorphism.Question_1.backend;

import Polymorphism.Question_1.entity.Student;

public class StudentManagement {
	private Student[] students;
	public StudentManagement() {
		students=new Student[9];
	}
	public void initStudents() {
		students[0]=new  Student(0, "hoa1", 1);
		students[1]=new  Student(1, "hoa2", 1);
		students[2]=new  Student(2, "hoa3", 1);
		students[3]=new  Student(3, "hoa4", 2);
		students[4]=new  Student(4, "hoa5", 2);
		students[5]=new  Student(5, "hoa6", 2);
		students[6]=new  Student(6, "hoa7", 3);
		students[7]=new  Student(7, "hoa8", 3);
		students[8]=new  Student(8, "hoa9", 3);
		students[9]=new  Student(9, "hoa10", 3);
	}
	public void caLopDiemDanh() {
		for(int i=0;i<=9;i++) {
			students[i].diemDanh();
		}
	}
	public void diHocBai() {
		for(int i=0;i<=9;i++) {
			if(students[i].getGroup()==1) {
			students[i].hocBai();
		}
	}
	}
	public void donVeSinh() {
		for(int i=0;i<=9;i++) {
			if(students[i].getGroup()==2) {
				students[i].donVeSinh();
			}
		}
	}
}
