package com.vti.academy.frontend;


import com.vti.academy.backend.MyMath;
import com.vti.academy.backend.Student_Exercise1;
import com.vti.academy.entity.PrimaryStudent;


public class Static_Program1 {
	private static Student_Exercise1[] students;
	
	public static void main(String[] args) throws Exception {
		Question1();
		//Question2();
		Question3();
		Question4();
		Question5();
		Question6();
	}
	public static void Question1() throws Exception {
		Student_Exercise1[] students = new Student_Exercise1[3];
		students[0]=new Student_Exercise1(1, "Nguyễn Văn A");
		students[1]=new Student_Exercise1(2, "Nguyễn Văn B");
		students[2]=new Student_Exercise1(3, "Nguyễn Văn C");
		for(int i=0;i<3;i++) {
			System.out.println(students[i]);
		}
		Student_Exercise1.college = "Đại học công nghệ";
		for(int i=0;i<3;i++) {	
		System.out.println(students[i]);
		}
		
	}
//	public static void Question2() {
//		System.out.println("số tiền của nhóm trc khi tiêu:");
//		System.out.println(Student_Exercise1.getmoneyGroup());
//		
//		student[0].spend(20);
//		System.out.println("số tiền còn sau khi Student thư 2 lấy 20k");
//		System.out.println(Student_Exercise1.getmoneyGroup());
////		B1: B1: Các Student sẽ nộp quỹ, mỗi Student 100k
//		student[0].spend(50);
//		System.out.println("Số tiền còn lại sau khi Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan: ");
//		System.out.println(Student_Exercise1.getmoneyGroup());
//	}
	public static void Question3() {
		System.out.println(MyMath.min(1,2));
		System.out.println(MyMath.sum(1,2));
	}
	public static void Question4() {
		Student_Exercise1.college="Đại học uneti";
		System.out.println("Sau khi thay đổi College: ");
		System.out.println(Student_Exercise1.college);	
	}
	public static void Question5() {
		System.out.println("số lượng sinh viên: ");
		System.out.println(Student_Exercise1.counter);
	}
	private static void Question6() {
		Student_Exercise1 student1=new PrimaryStudent("Nguyễn văn h");
		Student_Exercise1 student2=new PrimaryStudent("Nguyễn văn hh");
		System.out.println("số lượng student: "+Student_Exercise1.counter);
		System.out.println("số lượng primary student: " +PrimaryStudent.counter );
	}
	
	
	
	
	
	
}
