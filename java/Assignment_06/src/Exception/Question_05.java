package Exception;

import java.util.Scanner;

public class Question_05 {
	public static void main(String[] args) throws Exception {
		int age=inputAge();
		System.out.println("Tuổi: "+age);
	}
	public static int intputInt() throws Exception {
		try{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập vào một số:");
		int a;
		a=scanner.nextInt();
		return a;
		}catch (Exception e) {
			throw new Exception("Nhập số!");
		}
	}

	public static int inputAge() throws Exception {
		int age=intputInt();
		if(age>0) {
			return age;
		}else {
			throw new Exception("Nhập tuổi >0!");
		}
		
	}
}
