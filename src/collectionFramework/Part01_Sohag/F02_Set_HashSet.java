package collectionFramework.Part01_Sohag;

import java.util.HashSet;
import java.util.Set;

public class F02_Set_HashSet {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(50);
		s1.add(5);
		s1.add(500);
		s1.add(550);
		s1.add(150);
		
		s1.remove(150);
		System.out.println("\n----------------  --------------------\n");
		System.out.println(s1.size());
		
		
		System.out.println("\n\n---------------- for loop after removing one  --------------------\n");
		for (int singleElement:s1) {
			System.out.println(singleElement);
		}
		
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(s1);
		s2.add(1000);
		
		
		System.out.println("\n\n---------------- Add all from another list  --------------------\n");
		for (int singleElement:s2) {
			System.out.println(singleElement);
		}
		
		
		System.out.println("\n\n---------------- Printing after clear  --------------------\n");
		s2.clear();
		for (int singleElement:s2) {
			System.out.println(singleElement);
		}
		
		

	}
}
