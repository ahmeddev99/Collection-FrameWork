package YouTube.Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collection;

import javax.lang.model.element.Element;

public class A03_CollectionDemo {

	public static void main(String[] args) {
		
		System.out.println("\n--------------- Adding element to fruitcollection ----------\n");
		
		Collection<String> fruitCollection = new ArrayList<>();
		// this how we can used add method to add a new element to the collection
		fruitCollection.add("banana");
		fruitCollection.add("mango");
		fruitCollection.add("Apple");
		System.out.println(fruitCollection);
		
		System.out.println("\n--------------- removing element from fruitcollection ----------\n");
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
		
		
		System.out.println("\n--------------- particular element is present ----------\n");
		// check whether a particular element is present in a collection or not 
		//  using contains
		System.out.println(fruitCollection.contains("Apple"));  //contains method returns a boolean value either true or false
		
		System.out.println("\n--------------- particular element if is empty ----------\n");
		//  to see if there any elements in fruitCollection
		System.out.println(fruitCollection.isEmpty());
	
		System.out.println("\n--------------- Each Method ----------\n");
		//   Each Method to iterate or a collection (to list what element on the list) 
		
		fruitCollection.forEach(element-> {
			System.out.println(element);
		});


/*
     Collection intercface is a root interface of the collection hierarchy and whenever we ant to represent a group of
     individual object as a single unit or entity then we can go for collection 
 	
 	Collection Interface dont have direct implementation but list, queue, set, and other interface extends collection interface
 	so we can use their implementation classes to create a collection
 
*/
		
		

	}

}
