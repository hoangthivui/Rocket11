package Abstraction.Question1_Interface.frontend;

import java.util.Scanner;

import Abstraction.Question1_Interface.backend.MyNews;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		MyNews mynews=new MyNews();
		
		System.out.println("mời bạn nhập lựa chọn:"
				+ "1.Insert news"
				+ "2.View list new"
				+ "3.Average rate"
				+ "4.Exit");
		while (true) {
		System.out.println("mời bạn chọn chức năng: ");
		int choose=scanner.nextInt();
		switch (choose) {
		case 1:
			mynews.insertNews();
			System.out.println("thêm thành công!");
			break;
		case 2:
			mynews.viewListNews();		
			break;
		case 3:
			mynews.averageRate();
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
