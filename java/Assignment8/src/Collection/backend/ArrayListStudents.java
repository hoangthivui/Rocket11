package Collection.backend;

import java.util.ArrayList;
import java.util.List;

import Collection.entity.Student;

public class ArrayListStudents {
	private static ArrayList<Student> students;
	
	public static void hienthi(){
		List<Student> students=new ArrayList<>();
		students.add(new Student(1, "hoa"));
		students.add(new Student(2, "lan"));
		students.add(new Student(3, "ha"));
		System.out.println("Tổng số students: "+students.size());
		for(int i=0;i<students.size();i++) {
			System.out.print("Id: "+students.get(i).getId());
			System.out.println(", Name: "+students.get(i).getName());
			
		}
	}
	public static void studentthu2() {
		System.out.println("Student thứ 4: ");
		System.out.println(students.get(0));
	}
	
	public void printFirstAndLastStudent() {
		System.out.println(students.get(0));
		System.out.println(students.get(students.size() - 1));
	}

}
