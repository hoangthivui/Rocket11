package Polymorphism_Question02.backend.copy3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Polymorphism_Question02.entity.Student;


public class QL_student {
	 List<Student> students=new ArrayList<>();;
	 Scanner scanner=new Scanner(System.in);
	
	public void inputStudent() {
//		Student student=new Student();
//		students.add(student);
//		System.out.println("thêm thành công!");
		System.out.println("Nhập số sinh viên muốn nhập : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sinh viên thứ : " + i);
			students.add(new Student());
		}
	}

	public void showInforStudents() {
		for (Student student : students) {
			student.showInfo();
		}
	}
	

	public void xethocbong() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhập sv muốn xét học bổng: ");
		String ten=scanner.nextLine();
		for (Student student : students) {
			if (student.getTen().equals(ten)) {
				if (student.xetDiemHocBong()) {
					System.out.println("Sinh viên này được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			
			}
		}
	

	}
}
