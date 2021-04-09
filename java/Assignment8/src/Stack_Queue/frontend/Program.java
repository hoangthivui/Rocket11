package Stack_Queue.frontend;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import Collection.entity.Student;

public class Program {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
	    st.push("Nguyễn Văn Nam");
	    st.push("Nguyễn Văn Huyên");
	    st.push("Trần Văn Nam");
	    st.push("Nguyễn Văn A");
	    for (int i=0;i<=st.size();i++) {
			System.out.println(st.pop());
		}   
	    // inQueue();
	}
//	 public static void inQueue() {
//	    	Queue<String> st = new ArrayDeque<>();
//	    	st.add("Nguyễn Văn Nam");
//		    st.add("Nguyễn Văn Huyên");
//		    st.add("Trần Văn Nam");
//		    st.add("Nguyễn Văn A");
//		    
//		    for (String string : st) {
//				System.out.println(st.poll());
//			}   
//	    }
}
