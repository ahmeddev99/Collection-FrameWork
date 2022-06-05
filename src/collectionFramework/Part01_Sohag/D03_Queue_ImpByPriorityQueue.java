package collectionFramework.Part01_Sohag;

import java.util.PriorityQueue;
import java.util.Queue;

public class D03_Queue_ImpByPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		//lowest value will be the priority obj
		q.add(100);
		q.add(10);
		q.add(1000);
		q.add(1);
		q.add(111);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		
		Queue<String> q1 = new PriorityQueue<>();
		//lowest value will be the priority obj
		q1.add("Shayaan");
		q1.add("Zayn");
		q1.add("Azaya");
		q1.add("Mommy Bear");
		q1.add("Baba Bear");
		
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1.peek());

	}
}
