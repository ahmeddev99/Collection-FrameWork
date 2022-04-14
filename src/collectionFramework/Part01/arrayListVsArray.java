package collectionFramework.Part01;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListVsArray {

	public static void main(String[] args) {
		String nameString = "Sohag";
		String nameString1 = "Rayhan";
		
		String array[] = new String[10];
		array[0] = "sohag";
		array[1] = "tohag";
		array[2] = "rohag";
		array[3] = "nohag";
		array[4] = "yohag";
		array[5] = "wohag";
		array[6] = "lohag";
		array[7] = "mohag";
		array[8] = "pohag";
		array[9] = "aohag";
		
		// single elements print
		System.out.println("Testing cool stuff " + array[8]);
		
		// print all elements
		for(int i=0; i<12; i++) {
			System.out.println(array[i]);
		}
		
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(5);
		arrayList.add(5.4);
		arrayList.add("Stohag");
		arrayList.add("Stahag");
		arrayList.add("Stbhag");
		arrayList.add("Stchag");
		arrayList.add("Sthag");
		arrayList.add("Stdhag");
		arrayList.add("Stmhag");
		arrayList.add("Sthhag");
		arrayList.add("Stihag");
		arrayList.add("Stphag");
		arrayList.add("Stjhag");
		arrayList.add("Stwhag");
		
		// single element
		System.out.println(arrayList.get(0));
		
		// size of the element
		System.out.println(arrayList.size());
		
		// print all
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
