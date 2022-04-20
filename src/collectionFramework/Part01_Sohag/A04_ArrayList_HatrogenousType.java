package collectionFramework.Part01_Sohag;

import java.util.ArrayList;

public class A04_ArrayList_HatrogenousType {
	
	public static void main(String[] args) {
		ArrayList arrayList1=new ArrayList();
		
		arrayList1.add("Sohag");
		arrayList1.add(42);//Integer not int
		arrayList1.add(170.5);
	
	
	for(int j=0;j<arrayList1.size();j++) {
		System.out.println(arrayList1.get(j));
	}


	System.out.println("\n----------------------      -------------------------------------\n");
	
	int ar[] = {5,8,9,10};
	System.out.println(ar[3]);
	
	//for print all ^^ using for each loop
	for (int single:ar) {
		System.out.println(single);
	}
	
	
	
	
	}
}
