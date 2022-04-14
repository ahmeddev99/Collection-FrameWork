package collectionFramework.Part01;

import java.util.ArrayList;

public class arrayListHatrogenous {
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("Sohag");
		arrayList.add(42);
		arrayList.add(170.5);
		
		for (int j=0; j<arrayList.size(); j++) {
			System.out.println(arrayList);
		}
		
		
	}
}
