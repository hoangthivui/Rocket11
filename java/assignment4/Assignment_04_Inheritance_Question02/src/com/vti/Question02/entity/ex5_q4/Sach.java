package com.vti.Question02.entity.ex5_q4;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	private Scanner scanner;
	
	 public Sach() {	
		 scanner=new Scanner(System.in);
		 inputInfo();
	 }
	 
	public Sach(String tenTacGia, int soTrang) {
		super();
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
		scanner = new Scanner(System.in);
	}

	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}	
	@Override
	public void inputInfo() {
		super.inputInfo();
		System.out.println("mời bạn nhập vào tên tác giả:");
		tenTacGia=scanner.nextLine();
		System.out.println("mời bạn nhập vào số trang:");
		soTrang=scanner.nextInt();
		
	}
	@Override
	public void output() {
		super.output();
		System.out.println("ten tac gia" + tenTacGia);
		System.out.println("so trang " + soTrang);
	}
}
