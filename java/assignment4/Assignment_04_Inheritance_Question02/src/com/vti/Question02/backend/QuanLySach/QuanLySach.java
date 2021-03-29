package com.vti.Question02.backend.QuanLySach;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.vti.Question02.entity.ex5_q4.Bao;
import com.vti.Question02.entity.ex5_q4.Sach;
import com.vti.Question02.entity.ex5_q4.TaiLieu;
import com.vti.Question02.entity.ex5_q4.TapChi;

public class QuanLySach {
	private List<TaiLieu> tailieus;
	private Scanner scanner;
	
	
	public QuanLySach() {
		tailieus=new ArrayList<>();
		scanner=new Scanner(System.in);
	}
	public void themmoitailieu() {
		System.out.println("bạn muốn thêm gì? 1.Sách 2.Tạp Chí 3.Báo");
		int choose= scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			Sach s=new Sach();
			tailieus.add(s);
			System.out.println("thêm thành công!");
			break;
		case 2:
			
			break;
		
		default:
			break;
		}
	}
	public void xoatailieu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập mã tài liệu cần xóa: ");
		int maTaiLieu = scanner.nextInt();

		for (TaiLieu taiLieu : tailieus) {
			if (maTaiLieu == taiLieu.getMaTaiLieu()) {
				tailieus.remove(taiLieu);
			}
		}
	}
	public void hienthithongtintailieu() {
		for (TaiLieu taiLieu : tailieus) {
			taiLieu.output();
		}
	}
	public void timkiem() {
	
		int choose;
		System.out.println("Bạn muốn tìm kiếm theo loại nào? (1:Sách || 2: Tạp chí || 3: Báo)");
		choose = scanner.nextByte();

		switch (choose) {
		case 1:
			for (TaiLieu taiLieu : tailieus) {
				if (taiLieu instanceof Sach) {
					taiLieu.output();
				}
			}
			break;
		case 2:
			for (TaiLieu taiLieu : tailieus) {
				if (taiLieu instanceof TapChi) {
					taiLieu.output();
				}
			}
			break;
		case 3:
			for (TaiLieu taiLieu : tailieus) {
				if (taiLieu instanceof Bao) {
					taiLieu.output();
				}
			}
			break;
		default:
			System.out.println("Nhập sai !");
			break;
		}
	}
	
}
