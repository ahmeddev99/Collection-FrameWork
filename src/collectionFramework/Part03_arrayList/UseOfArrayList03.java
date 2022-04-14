package collectionFramework.Part03_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList03 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add(5); // Index 2 will be removed for line 25
		ar.add("Manir");
		// Nafasat will come at index 5 (here, from line 23)
		ar.add("Orfat");
		ar.add("Tofael");
		ar.add("Imran");
		ar.add(5.5);
		ar.add('M');
		// New
		ar.add(5, "Nafasat"); // adding value: adding in index [5]
		ar.add("Mohammad");
		// New
		ar.remove(2); // Index 2 will remove

		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // in Array this is length

		ArrayList ar2 = new ArrayList(20); // what does it mean by 20? we decide the capacity to 20
		ArrayList ar3 = new ArrayList(ar); // what does it mean by ar? we decide the capacity to the size of ar, 10, as
											// Index 2 is removed

		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(2)); // output:
		System.out.println("Single index value: " + ar.get(4)); // output:
		System.out.println("Single index value: " + ar.get(5)); // output:
		System.out.println("Single index value: " + ar.get(9)); // output:
		// Check the below line by removing comment
		// System.out.println("Single index value: " + ar.get(10)); // output:
		// IndexOutOfBoundsException

		System.out.println("Last index value: " + ar.get(ar.size() - 1)); // output:
		System.out.println("Second last index value: " + ar.get(ar.size() - 2)); // output:

		// looking for index number of element
		System.out.println(ar.indexOf("Imran")); //output: 
				
		System.out.println("\nThe new Array List: " + ar);

		// use of addAll() method
		ArrayList ar4 = new ArrayList(); // creaing new ArrayList
		ar4.add("A");
		ar4.add("B");
		ar4.add("C");

		// applied addAll() in ar[]-->now in ar[] we have also ar5[] value too
		ar.addAll(ar4);
		System.out.println("\nAfter using addAll method the new Array List: " + ar);

		System.out.println("\n^^^^^^^^^^^^^ After using Iterator the new Array List ^^^^^^^^^^^^^^^^ ");
		// no specific reason to use iterator, we can also use for loop
		// No need of this loop, just used to show data line by line
		Iterator iterator = ar.iterator(); // Iterator is an interface
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// use of removeAll() method
		ar.removeAll(ar4);
		System.out.println("\nAfter using removeAll method the new Array List: " + ar);
		System.out.println("\n^^^^^^^^^^^^^ After using removeAll()+Iterator the new Array List ^^^^^^^^^^^^^^^^ ");
		// No need of this loop, just used to show data line by line
		Iterator ar5 = ar.iterator();
		while (ar5.hasNext()) {
			System.out.println(ar5.next());
		}

		// use of retainAll()--only keeps common value between two ArrayList obj
		ArrayList ar6 = new ArrayList(); // creating new ArrayList
		ar6.add("Shohag"); // -------this is common
		ar6.add("Rahman");
		ar6.add("salma");
		ar6.add("Tofael");
		// applying retainAll() below, which will keep the common from the list
		ar.retainAll(ar6);
		System.out.println("\nAfter using retainAll method the new Array List: " + ar);
		// Explain why Tofael is Twice in outcome
		// ar6.retainAll(ar); //what will happen when we do this? question: need to
		// solve, doesn't work
		// No need of this loop, just used to show data line by line
		System.out.println("\n^^^^^^^^^^^^^ After using retainAll the new Array List ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}
