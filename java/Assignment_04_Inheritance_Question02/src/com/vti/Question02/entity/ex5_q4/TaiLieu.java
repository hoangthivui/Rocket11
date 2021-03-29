package com.vti.Question02.entity.ex5_q4;

import java.util.Scanner;

public  class TaiLieu {
	protected int maTaiLieu;
	protected String tenNXB;
	protected int soBanPhatHanh;
	private Scanner scanner;
	
	public TaiLieu() {
		
	}
	public TaiLieu(int maTaiLieu,String tenNXB,int soBanPhatHanh) {	
		this.maTaiLieu=maTaiLieu;
		this.tenNXB=tenNXB;
		this.soBanPhatHanh=soBanPhatHanh;
		Scanner scanner =new Scanner(System.in);
	}
	public int getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("mời bạn nhập vào mã tài liệu: ");
		maTaiLieu=scanner.nextInt();
		scanner.nextLine();
		System.out.println("mời bạn nhập vào tên NXB: ");
		tenNXB=scanner.nextLine();
		System.out.println("mời bạn nhập vào số bản phát hành: ");
		soBanPhatHanh=scanner.nextInt();
	}
	
}
