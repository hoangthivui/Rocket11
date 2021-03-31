package Abstraction.Question2.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.ThiSinh;

public class TuyenSinh implements ITTuyenSinh{
	private Scanner scanner;

	private List<ThiSinh> thisinhs;
	
	public TuyenSinh() {
		thisinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	public void themThiSinh() {
		System.out.println("Nhập số thí sinh muốn nhập: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			ThiSinh thisinh = new ThiSinh();
			thisinh.nhap();
			thisinhs.add(thisinh);
		}
	}

}
