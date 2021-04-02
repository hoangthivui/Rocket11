package Exception;

import java.util.Scanner;

public class Quest‭ion_06 {
	public static void main(String[] args) {
		
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
		if(age==1) {
			return age;
		}else {
			throw new Exception("wrong inputing! Please input an age as int, input again");
		}
		
	}
}
