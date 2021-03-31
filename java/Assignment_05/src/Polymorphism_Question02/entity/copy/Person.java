package Polymorphism_Question02.entity.copy;

import java.util.Scanner;

public abstract class Person {
	private String ten;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;
	private Scanner scanner;
	
	public Person() {
		Scanner scanner=new Scanner(System.in);
		inputInfo();
	}
	
	public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		Scanner scanner=new Scanner(System.in);
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void inputInfo() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("nhập tên: ");
		ten=scanner.nextLine();
		System.out.println("nhập giới tính: ");
		gioiTinh=scanner.nextLine();
		System.out.println("nhập ngày sinh: ");
		ngaySinh=scanner.nextLine();
		System.out.println("nhập quê quán: ");
		diaChi=scanner.nextLine();
	}
	public void showInfo() {
		System.out.println("Tên: "+ten);
		System.out.println("Giới tính: "+gioiTinh);
		System.out.println("Ngày sinh: "+ngaySinh);
		System.out.println("Địa chỉ: "+diaChi);
	}
	
}
