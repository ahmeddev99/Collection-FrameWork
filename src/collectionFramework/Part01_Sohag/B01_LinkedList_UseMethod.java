package collectionFramework.Part01_Sohag;

/*
 
 
It implements List interface in collection framework
It uses a doubly linked list internally to store the elements. 
It can store the duplicate elements. 
It maintains the insertion order 
not synchronized. 
In LinkedList, the manipulation is fast because no shifting is required.
Some Commonly used methods
addFirst()
addLast()
get(0 -->specific value 
set(2,”Rahman”)—to set(replace) specific index value
removeFirst()
removeLast()
          We can print by using: advance for loop, iterator, while loop
          
*/

import java.util.LinkedList;
import java.util.List;


public class B01_LinkedList_UseMethod {
	
	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);//
		list.add(15);//
		list.addLast(5000);
		list.add(25);//
		list.add(35);//
		list.addFirst(50);
		

		for(int singleObj:list) {
			System.out.println(singleObj);
		}
		System.out.println("-------------------"	);	
		list.removeFirst();
		
		for(int singleObj:list) {
			System.out.println(singleObj);
		}
	
		
	}
}
