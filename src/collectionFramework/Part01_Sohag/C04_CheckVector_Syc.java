package collectionFramework.Part01_Sohag;

import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class C04_CheckVector_Syc {

	// to see how Vector is n Sycronized

	// creationg obj of Vector----where we will store Integer type obj
	static Vector<Integer> list = new Vector<>();

	// method to add obj in LinkedLis
	public static void addingObj() {
		Random random = new Random();
		list.add(random.nextInt(100));
	}

	public static void main(String[] args) {
		// creating thread 1
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					addingObj();
				}

			}
		});
		// creating 2nd Thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					addingObj();
				}

			}
		});

		// now start our thread
		t1.start();
		t2.start();
		// stoping main thread and to let other thread finish
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list.size());

	}
}
