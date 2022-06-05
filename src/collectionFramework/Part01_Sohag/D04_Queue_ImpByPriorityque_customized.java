package collectionFramework.Part01_Sohag;

import java.util.PriorityQueue;
import java.util.Queue;

public class D04_Queue_ImpByPriorityque_customized {

	public static void main(String[] args) {
		A07_EnthrallSt st1 = new A07_EnthrallSt("Shayaan", 10);
		A07_EnthrallSt st2 = new A07_EnthrallSt("Zayn", 5);
		A07_EnthrallSt st3 = new A07_EnthrallSt("Azaya", 1);
		A07_EnthrallSt st4 = new A07_EnthrallSt("Rubal", 40);
		
		
		Queue<A07_EnthrallSt> q = new PriorityQueue<>(new D05_CompareSt());
		q.add(st1);
		q.add(st2);
		q.add(st3);
		q.add(st4);
		
		
		System.out.println(q.peek().name);
		

	}
}
