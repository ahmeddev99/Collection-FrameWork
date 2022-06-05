package collectionFramework.Part01_Sohag;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class F01_Set_HashSet {

	public static void main(String[] args) {
		
		System.out.println("\n------------------- Non-Generate Element (String or Integer)-----------------\n");
		Set s = new HashSet();
		s.add("Rubal");
		s.add('S');
		s.add(50);
		s.add(50.5);
		s.add(50.5);
		s.add(null);
			
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("\n\n------------------- Generate Element (String or Integer)-----------------\n");
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(50);
		s1.add(5);
		s1.add(500);
		s1.add(550);
		s1.add(150);
		
		
		for (int singleElement:s1) {
			if (singleElement==5) {  // putting conditon to match then print
				System.out.println("---------- 1  -------------");
				System.out.println("Yes 5 is there");
			} else {
				System.out.println(singleElement);
				System.out.println("iteration done");
			}
		}
		
		
		
		
		
		
		
		

	}
}
