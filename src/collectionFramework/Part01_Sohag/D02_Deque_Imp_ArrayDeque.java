package collectionFramework.Part01_Sohag;

import java.util.ArrayDeque;
import java.util.Deque;

public class D02_Deque_Imp_ArrayDeque {

	public static void main(String[] args) {
		// creating obj of ArrayDeque or Implementing Deque by ArrayDeque
		
		System.out.println("\n[------------------ DQ List ------------------]\n");
		Deque<String> dq = new ArrayDeque<>();
		dq.offer("Azaya");
		dq.add("Zayn");
		dq.push("Shayaan");  // adding at the top --push adding element to the top of the list
		
		System.out.println(dq.peek());

		
		System.out.println("\n\n[------------------ DQ1 List ------------------]\n");
		Deque<String> dq1 = new ArrayDeque<>();
		dq1.add("Shayaan");
		dq1.add("Azaya");
		dq1.add("Zayn");
		dq1.push("Mommy Bear");
		dq1.push("Papa Bear");
		dq1.addFirst("Family Bear");  // -addFirst- comes first than -push- than -add-
		
		System.out.println(dq1);
		
		
		System.out.println("\n\n[------------------ DQ1 List ------------------]\n");
		Deque<String> dq2 = new ArrayDeque<>();
		dq2.push("Shayaan");
		dq2.push("Azaya");
		dq2.push("Zayn");
		dq2.push("Mommy Bear");
		dq2.push("Papa Bear");
		dq2.push("Family Bear");  // -addFirst- comes first than -push- than -add-
		System.out.println("-------------------------");
		for (int i=0; i<dq2.size(); i++) {
			System.out.println(dq2.pop());
		}
		
	//	System.out.println(dq2);
		
		System.out.println("\n\n[------------------ Remove First ------------------]\n");
		System.out.println(dq2.removeFirst());
		
		System.out.println("\n\n[------------------ Remove Last ------------------]\n");
		System.out.println(dq2.removeLast());
		
		
		System.out.println("\n\n[------------------ Contains() ------------------]\n");
		// using contains() checking obj is there or not execute our next line
		if (!dq2.contains("Shayaan")) {
			System.out.println("Let's Play");
		}
		
		
		
		
		
		
		
	}
}
