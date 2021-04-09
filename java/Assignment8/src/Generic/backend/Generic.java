package Generic.backend;

import Generic.entity.Employee;
import Generic.entity.MyMap;
import Generic.entity.Phone;
import Generic.entity.Staff;
import Generic.entity.Student;

public class Generic {

	public static void bai1() {
		
		Student student=new Student(1, "nguyễn văn a");
		Student student2=new Student(2, "nguyễn văn b");
		Student student3=new Student(3, "nguyễn văn c");
		print(student);
		print(student2);
		print(student3);
	}
	
	private static <T> void print(T a) {
		System.out.println(a);
	}
	public void bai4() {
		
		Integer[] arrInt = { 5, 10, 15 };
		Float[] arrFloat = { 6f, 5f, 15f };
		Double[] arrDouble = { 5.2, 2.6, 6.9 };

		// print array
		printArray(arrInt);
		printArray(arrFloat);
		printArray(arrDouble);
	}
	
	private <T> void printArray(T[] arr) {
		for (T x : arr) {
			System.out.println(x);
		}
	}
	
	public void bai5() {
		Integer[] salaryEmp1 = { 1000, 1200, 1200 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "nguyễn văn a", salaryEmp1);
		System.out.println("Employee vừa khởi tạo: ");
		print(employee1);
		System.out.println("Tháng lương cuối cùng của employee 1: " + salaryEmp1[salaryEmp1.length - 1]);

		
		Float[] salaryEmp2 = { 11.1f, 12.22f, 99.2f };
		Employee<Float> employee2 = new Employee<Float>(1, "nguyễn văn b", salaryEmp2);
		System.out.println("Employee vừa khởi tạo: ");
		print(employee2);
		System.out.println("Tháng lương cuối cùng của employee 2: " + salaryEmp2[salaryEmp2.length - 1]);

		
		Double[] salaryEmp3 = { 1000d, 1200d, 1200d, 6900d, 9600d, 12000d };
		Employee<Double> employee3 = new Employee<Double>(1, "nguyễn văn c", salaryEmp3);
		System.out.println("Employee vừa khởi tạo: ");
		print(employee3);
		System.out.println("Tháng lương cuối cùng của employee 3: " + salaryEmp3[salaryEmp3.length - 1]);
	}
	public void bai7() {
		// email và phone
		Phone<String, String> email = new Phone<String, String>("nguyenvana@gmail.com", "0123456789");
		System.out.println("Email: " + email.getKey() + " ++ " + "Phone Number: " + email.getPhoneNumber());

		// id+ phone
		Phone<Integer, String> id = new Phone<Integer, String>(1, "0123456789");
		System.out.println("id: " + id.getKey() + " / " + "Phone Number: " + id.getPhoneNumber());

		//name+phone
		Phone<String, String> name = new Phone<String, String>("vana", "0123456789");
		System.out.println("Name: " + name.getKey() + " / " + "Phone Number: " + name.getPhoneNumber());
	}
	public void bai8() {
		// Integer
		Staff<Integer> staff1 = new Staff<Integer>(1, "Nguyễn Văn A");
		System.out.println("ID: " + staff1.getId() + " & " + "Name: " + staff1.getName());

		// Float
		Staff<Float> staff2 = new Staff<Float>(1.5f, "Nguyễn Văn A");
		System.out.println("ID: " + staff2.getId() + " & " + "Name: " + staff2.getName());
	}

}
