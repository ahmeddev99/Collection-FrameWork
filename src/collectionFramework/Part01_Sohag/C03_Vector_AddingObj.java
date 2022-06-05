package collectionFramework.Part01_Sohag;

import java.util.Iterator;
import java.util.Vector;

public class C03_Vector_AddingObj {
	
//		implements the List interface
//		uses a dynamic array
//	 	different types of value
//		synchronized

	
	public static void main(String[] args) {
	
		// creating obj of Vector
		Vector<Integer> vlist=new Vector<>();
		//dding obj through for loop----here the value of i will be Integer type obj
		for(int i=100;i<110;i++) {
			vlist.add(i);	
		}
		
		//checking how many obj added
		System.out.println(vlist.size());
		
		//Printing all obj added in Vector
		
		Iterator iterator=vlist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
}
