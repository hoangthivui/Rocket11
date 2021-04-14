package com.vti.academy.DemoMavenProject.Utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner=new Scanner(System.in);
	
	public static int inputInt() {
		return inputInt("hãy nhập vào một số!");
	}
	public static String inputString() {
		return inputString("Hãy nhập vào ký tự!");
	}
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errorMessage);
			}
		}
	}
	public static int inputId() {
		while (true) {
			int id = inputInt("nhập số!");
			if (id > 0) {
				return id;
			}
			System.out.println("nhập id là int phải lớn hơn> 0");
		}
	}
	
}
