package YouTube.Collection_FrameWork;


/*
--> List is an ordered collection it maintains the insertion order, which means upon 
	displaying the list content it will display the elements
	in the same order in which they got inserted into the list.

--> Java list provides control over the position where you can insert an element.

--> You can access elements by their index and also search elements in the list.

--> List allows you to add duplicate elements.

--> List allows you to have ''null' elements.

--> List indexes start from 0, just like arrays.

--> Some of the most used List implementation classes are 
	ArrayList, LinkedList, Vector, Stack, CopyOnWriteArrayList	
*/

import java.util.ArrayList;
import java.util.List;

public class A04_List_Interface_Overview {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();  // using arraylist implementation class to create object of list
		
		System.out.println("\n\n|---------------> Adding Duplicate Elements <---------------|\n");
		// list allows you to add duplicate elements
		list.add("elements1");
		list.add("elements1");
		list.add("elements2");
		list.add("elements2");
		System.out.println(list);
		
		
		System.out.println("\n\n|---------------> 'null' Elements <---------------|\n");
		// List allows you to have 'null' elements
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		System.out.println("\n\n|---------------> Insertion Order <---------------|\n");
		List<String> orderList = new ArrayList<>();
		// insertion order  ---> list interface maintains or insert insertion order
		orderList.add("elements01");   // index 01
		orderList.add("elements02");   // index 02
		orderList.add("elements07");   // index 03
		orderList.add("elements08");   // index 04
		orderList.add("elements03");   // index 05
		orderList.add("elements04");   // index 06
		orderList.add("elements09");   // index 07
		orderList.add("elements10");   // index 08
		orderList.add("elements06");   // index 09
		orderList.add("elements05");   // index 10
		System.out.println(orderList);
		
		System.out.println("\n\n|---------------> Accessing elements from List <---------------|\n");
		// access elements from list
		System.out.println(orderList.get(5));
		System.out.println(orderList.get(7));
		
	}
}
