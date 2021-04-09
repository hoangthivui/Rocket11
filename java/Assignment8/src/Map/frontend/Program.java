package Map.frontend;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		Map<Integer,String> student=new HashMap<>();
		student.put(1,"hoàng văn a");
		student.put(2, "hoàng văn b");
		System.out.println(student.get(1));
		System.out.println(student.keySet());
		System.out.println(student.values());
		
		}
		
	}


