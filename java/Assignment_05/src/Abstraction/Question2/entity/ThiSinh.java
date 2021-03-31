package Abstraction.Question2.entity;

import java.util.Scanner;

public class ThiSinh {
	protected int soBaoDanh;
	protected String hoTen;
	protected String diaChi;
	protected int mucUuTien;
	
	
	public ThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
	}


	public int getSoBaoDanh() {
		return soBaoDanh;
	}


	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public int getMucUuTien() {
		return mucUuTien;
	}


	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	protected void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số báo danh:");
		soBaoDanh = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập tên:");
		hoTen = scanner.nextLine();
		System.out.println("Nhập địa chỉ:");
		diaChi = scanner.nextLine();
		System.out.println("Nhập mức ưu tiên:");
		mucUuTien = scanner.nextInt();
		}
	protected void output() {
		System.out.println("SBD:"+soBaoDanh);
		System.out.println("họ tên:"+hoTen);
		System.out.println("địa chỉ:"+diaChi);
		System.out.println("mức ưu tiên:"+mucUuTien);
	}

	
}
