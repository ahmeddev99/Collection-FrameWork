package collectionFramework.Part01_Sohag;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class F04_Set_LinkedHashSet {

	public static void main(String[] args) {
		Set<String> boys = new LinkedHashSet<>();
		boys.add("Rubal");
		boys.add("Shayaan");
		boys.add("Zayn");
		boys.add("Azaya");
		boys.add("Abba Bear");
		boys.remove("Abba Bear");
		boys.add(null);
		boys.add(null);
		boys.add("Jamil");
		
		System.out.println("\n----------- Size ---------------\n");
		System.out.println(boys.size());
		
		System.out.println("\n\n----------- Iterator ---------------\n");
		Iterator it = boys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
