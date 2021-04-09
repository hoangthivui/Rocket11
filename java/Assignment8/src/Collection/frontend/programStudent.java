package Collection.frontend;

import java.util.ArrayList;
import java.util.List;

import Collection.backend.ArrayListStudents;
import Collection.entity.Student;

public class programStudent {
	List<Student> students;
	public static void main(String[] args) {
		ArrayListStudents arr=new ArrayListStudents();
		arr.hienthi();
//		arr.studentthu2();
		arr.printFirstAndLastStudent();
	}
	
}
		


