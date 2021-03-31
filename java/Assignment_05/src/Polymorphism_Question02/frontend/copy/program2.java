package Polymorphism_Question02.frontend.copy;

import java.util.Scanner;

import Polymorphism_Question02.backend.QL_student;

public class program2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		QL_student hb=new QL_student();
		
		System.out.println("mời bạn nhập lựa chọn: "
				+ "\n1.Thêm sinh viên "
				+ "\n2.Xem danh sách sinh viên"+
				"\n3.Xét học bổng");
		while (true) {
			System.out.println("mời bạn chọn chức năng:");
		int choose=scanner.nextInt();
		switch (choose) {
		case 1:
			hb.inputStudent();
			break;
		case 2:
			hb.showInforStudents();
			break;
		case 3:
			hb.xethocbong();
			break;
		case 4:
			System.out.println("Thoát khỏi chương trình.");
			scanner.close();
			return;
		default:
			break;
		}
		}
	}
}