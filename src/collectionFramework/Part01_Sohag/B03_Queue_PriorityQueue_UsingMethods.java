package collectionFramework.Part01_Sohag;

/*
 
Queue interface maintains the first-in-first-out order. 
It can be defined as an ordered list that is used to hold the elements which are about to be processed. 
There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
Queue interface can be instantiated as:
Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();
PriorityQueue
PriorityQueue class implements the Queue interface
holds the elements or objects which are to be processed by their priorities
PriorityQueue doesn't allow null values to be stored in the queue

*/

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class B03_Queue_PriorityQueue_UsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Queue<Integer> q = new LinkedList<>();
		 // ^^ implementing Queue by LinkedList or creating q
	        q.add(5);
	        q.add(50);
	        q.add(15);
	        q.add(55);
	        q.add(500);
	 
	        System.out.println(q);
	        System.out.println(q.peek());

	}

}
