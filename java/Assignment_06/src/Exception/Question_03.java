package Exception;

public class Question_03 {
public static void main(String[] args) {
	try{
		int[] numbers= {1,2,3};
	
	System.out.println(numbers[10]);

	}catch (Exception e) {
		System.out.println("k có phần tử 10 trong mảng!");
	}
}

}
