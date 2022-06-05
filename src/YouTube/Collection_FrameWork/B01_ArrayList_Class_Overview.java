package YouTube.Collection_FrameWork;


/*
--> An ArrayList is a re-siable array, also called a dynamic array. It grows its size to accommodate 
	new elements and shrink the size when the lements are removed.

--> ArrayList internally uses an array to store the elements. Just like arrays, it allows you to retrieve 
	the elements by their index.

--> Java ArrayList allows duplicate and null values.

--> Java ArrayList is an ordered collection. It maintains the insertion order of the elements.

--> You cannot create an ArrayList of primitve type like int, char etc. You need to use boxed
	types like Integer, Character, Boolean etc.

--> Java ArrayList is not Synchronized. If multiple threads try to modify an ArrayList at the same time, 
	then the final outcome will be non-deterministic. You must explicitly synchronize access to an ArrayList 
	if multiple threads are gonna modify it.



	Default initial capcity = 10


--> ArrayList extends AbstractList
	implements List --> RandomAccess, Cloneable, Java.io.Serializable 

*/


import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.html.HTMLDocument.Iterator;


//How to create an ArrayList using the ArrayList() constructor.

//Add new elements to an ArrayList using the add() method.

public class B01_ArrayList_Class_Overview {

	public static void main(String[] args) {
		
		// created arraylist object
		// you can use one of the interface as a reference type
		ArrayList<String> fruits = new ArrayList<>(); // default constructor is 10 capcity
//		List<String> fruits = new ArrayList<>(25); // assign the size
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println(fruits);
		
		
		System.out.println("--------------");
		for (int i=0; i<fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("--------------");
		for (String fr:fruits) {
			System.out.println(fr);
		}
		
		
		
		
			

	}
}
