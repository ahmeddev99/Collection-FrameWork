package YouTube.Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

/*
-->> How to check if an ArrayList is empty using the isEmtpy() method.

-->> How to find the size of an ArrayList using the size() method.

-->> How to access the element at a praticular index in an ArrayList using the get() method.

-->> How to Modify the element at a particular index in an ArrayList using the set() method.
*/
public class B03_AccessingElementsFromAnArrayList {

	public static void main(String[] args) {
		List<String> topProgrammingLanguages = new ArrayList<>();
		
		System.out.println("\n[------------------ Printing to see ArrayList empty ------------------]\n");
		// Check if an ArrayList is empty
		System.out.println("is the topProgrammingLanguages list empty? : " + topProgrammingLanguages.isEmpty());
		
		// Adding name to topProgrammingLanguages
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add(".net");
		topProgrammingLanguages.add("JavaScript");
		
		
		System.out.println("\n\n[------------------ Checking the size of the ArrayList ------------------]\n");
		
		// Find the size of an ArrayList
		System.out.println("Here are Top " + topProgrammingLanguages.size() + " Programming Languages in the world");
		
		
		System.out.println("\n\n[------------------ Retrieve Element at given index ------------------]\n");
		
		//  Retrieve the element at a given index
		String bestProgrammingLanguages = topProgrammingLanguages.get(2);
		System.out.println("Best Programming Languages:=>  " + bestProgrammingLanguages);
		
		String secondBestProgrammingLanguages = topProgrammingLanguages.get(1);
		System.out.println("Second Best Programming Languages:=>  " + secondBestProgrammingLanguages);
		
		
		System.out.println("\n\n[------------------ Modify Element at given index ------------------]\n");
		
		// How to modify the element at given index
		topProgrammingLanguages.set(4, "C#");
		System.out.println(topProgrammingLanguages);
		
		
		

	}
}
