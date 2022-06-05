package collectionFramework.Part01_Sohag;

import java.util.HashSet;
import java.util.Set;

public class F03_Set_HashSet_Program {

	public static void main(String[] args) {
		System.out.println("\n\n----------------- STRING 1st Ex -----------------");
		Set<String> boys = new HashSet<>();
		boys.add("Sohag");
		boys.add("Rubal");
		boys.add("Jamil");
		boys.add("Shayaan");
		boys.add("Zayn");
		boys.add("Azaya");
		
		if (boys.contains("Jamil")) {
			System.out.println("Lets Play Basketball");
		} else if (boys.contains("Azaya")) {
			System.out.println("Lets go play Soccer");
		} else if (boys.contains("Shayaan")) {
			System.out.println("Lets go play Football");
		} else {
			System.out.println("Lets go play sports my superStar");
		}
		
		
		System.out.println("\n\n----------------- STRING 2nd Ex -----------------");
		Set<String> boys2 = new HashSet<>();
		boys2.add("Rubal");
		boys2.add("Jamil");
		boys2.add("Shayaan");
		boys2.add("Zayn");
		boys2.add("Azaya");
		
		for (int i=0; i<boys2.size(); i++) {
			boys2.remove(i);
			if (!boys2.isEmpty()) {
				System.out.println("Rest items: " + boys2);
			} else {
				System.out.println("No more elements");
			}
		}
		
		
		
		
		System.out.println("\n\n----------------- INTEGER -----------------");
		Set<Integer> boys3 = new HashSet<>();
		boys3.add(50);
		boys3.add(525);
		boys3.add(500);
		boys3.add(200);
		boys3.add(700);
		
		for (int i=50; i<=700; i++) {
			boys3.remove(i);
			if (!boys3.isEmpty()) {
				System.out.println("Rest items: " + boys3);
			} else {
				System.out.println("No more elements");
			}
		}
		
		

	}
}
