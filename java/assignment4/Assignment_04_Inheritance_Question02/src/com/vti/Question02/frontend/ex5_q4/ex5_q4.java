package com.vti.Question02.frontend.ex5_q4;

import java.util.Scanner;

import com.vti.Question02.backend.QuanLySach.QuanLySach;

public class ex5_q4 {
	public static void main(String[] args) {
		QuanLySach qls=new QuanLySach();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("mời bạn nhập vào chức năng muốn sử dụng:\n 1.thêm mới tài liệu \n 2.Xóa tài liệu \n 3.hiện thi \n 4.tìm kiếm \n 5.thoát");
		while (true) {
			System.out.print("Mời bạn chọn chức năng: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				qls.themmoitailieu();
				break;
			case 2:
				qls.xoatailieu();
				break;
			case 3:
				qls.hienthithongtintailieu();
				break;
			case 4:
				qls.timkiem();
				break;
			case 5:
				System.out.println("Thoát khỏi chương trình.");
				scanner.close();
				return;
			default:
				break;
			}
		}
	}
}

