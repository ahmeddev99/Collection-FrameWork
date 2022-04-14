package collectionFramework.Part01;

import java.util.ArrayList;

public class arrayListGeneric {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList();
		
		arrayList.add("Sohag");
//		arrayList.add(42); // its only going to accepte String and not Integer
		
		
		ArrayList<Integer> arrayList1 = new ArrayList();

//		arrayList1.add("Sohag"); // its only going to accepte integer and not String
		arrayList1.add(42); 
		
		
		
		for (String singleList:arrayList) {
			System.out.println(singleList);
		}
		
		
		
		
		
		
	}

}
