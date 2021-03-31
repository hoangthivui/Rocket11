package Polymorphism_Question02.entity;

import java.util.Scanner;

public class Student extends Person{
	private int maSV;
	private float diemTB;
	private String email;
	private Scanner scanner;
	
	 
	public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, int maSV, float diemTB, String email,
			Scanner scanner) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
		this.scanner = scanner;
	}

	public Student() {
		scanner=new Scanner(System.in);
		inputInfo();
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public void  inputInfo() {
		super.inputInfo();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Mã SV: ");
		maSV=scanner.nextInt();
		System.out.println("Điểm TB: ");
		diemTB=scanner.nextInt();
		System.out.println("Email: ");
		email=scanner.nextLine();
		scanner.nextLine();
	}
	@Override
	public void  showInfo() {
		super.showInfo();
		System.out.println("Mã SV: "+maSV);
		System.out.println("Điểm TB: "+diemTB);
		System.out.println("Email: "+email);
	}
	public boolean xetDiemHocBong() {
		return diemTB >= 8;
	}
}
