package Exception;

import java.util.Scanner;

public class Question_04 {
	public static void main(String[] args) throws Exception {
		int age=intputAge();
		System.out.println("Tuổi: "+age);
	}
	private static int inputInt() throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập số: ");
			int a=scanner.nextInt();
			return a;
		}catch (Exception e) {
			throw new Exception("Nhập số!");
		}	
	}
	private static int intputAge() throws Exception {
		int age=inputInt();
		if(age>0) {
			return age;
		}else {
			throw new Exception("tuổi phải lớn hơn 0");
		}
	}
}
