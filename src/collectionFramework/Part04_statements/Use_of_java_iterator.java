package collectionFramework.Part04_statements;

import java.util.ArrayList;
import java.util.Iterator;

public class Use_of_java_iterator {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(); // ArrayList is a class
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add("Manir");
		ar.add("Orfat");
		ar.add("Shohag");
		ar.add("Lobid");
		ar.add("Nafasat");
		ar.add("Mohammad");

		System.out.println("\n^^^^^^^^^^^^^ After using Iterator the new Array List ^^^^^^^^^^^^^^^^ ");
		Iterator<String> iterator = ar.iterator(); // legacy type, first loop used in java
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
