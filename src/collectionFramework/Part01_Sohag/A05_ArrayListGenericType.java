package collectionFramework.Part01_Sohag;

import java.util.ArrayList;
import java.util.Iterator;

public class A05_ArrayListGenericType {
	
	public static void main(String[] args) {
		
System.out.println("\n----------------------      -------------------------------------\n");	

	ArrayList<String> names = new ArrayList();
	
	names.add("Sohag");
	names.add("Ryhan");
	names.add("Fatima");
	names.add("");
	names.add("");
	names.add("");
	
	for (String singleName : names) { // names=[Sohag Ryhan Fatima]---if we Split Sohag then Ryhan then Fatime
	
		if (singleName == "Ryhan") {
			System.out.println(singleName);
		}
	}
	
	
		
System.out.println("\n----------------------      -------------------------------------\n");	
		
		ArrayList<Integer> arrayList11=new ArrayList();
		
		arrayList11.add(5);
		arrayList11.add(15);
		arrayList11.add(50);
		arrayList11.add(55);
		
		
		Iterator it=arrayList11.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			}

	}
}
