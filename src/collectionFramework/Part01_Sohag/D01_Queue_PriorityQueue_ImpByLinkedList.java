package collectionFramework.Part01_Sohag;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class D01_Queue_PriorityQueue_ImpByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Queue<Integer> queue = new LinkedList<>();
		 // ^^ implementing Queue by LinkedList or creating q
			queue.add(5);
			queue.add(50);
			queue.add(15);
			queue.add(55);
			queue.add(500);
			
			
			System.out.println("\n[------------------ Printing normal ------------------]\n");
			// Printing normal all from the list
	        System.out.println(queue);
 
	        
	        
	        System.out.println("\n\n[------------------ Printing For If Loop ------------------]\n");
	        for (int i = 0; i < 6; i++) {
	        	if (!queue.isEmpty()) {
	        		System.out.println(queue.poll());
				}	
			}
	        
	        
	        
	        System.out.println("\n\n[------------------ Printing is List Empty ------------------]\n");
	        if (!queue.isEmpty()) {
	        	System.out.println(queue.peek());
	        }
	    
	        
	        
	        
	        System.out.println("\n\n[------------------ Printing For Each Loop ------------------]\n");
	        // printing obj by for each loop
	        for (int q:queue) {
	        	System.out.println(queue);
	        }
	        
	        
	        
	        System.out.println("\n\n[------------------ Printing Top Object ------------------]\n");
	     // first in first out (FIFO)
	        System.out.println(queue.peek()); // peek -- top obj will be selected
	        
	        
	        
	        System.out.println("\n\n[------------------ Removing Top Object ------------------]\n");
	        // removing
	        System.out.println(queue.poll()); // taking top and removing
	        
	        
	        
	        System.out.println("\n\n[------------------ Printing Top Obj after removing ------------------]\n");
	        System.out.println(queue.peek()); // peek -- top obj will be selected
	        

	}

}
