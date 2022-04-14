package collectionFramework.Part03_arrayList;

import java.util.ArrayList;
import java.util.Random;
/*
 * Author: Shohag, Organised by: Tofael
 */
public class UseOfArrayList05 {
	public static void main(String[] args) {
		int limit = 5;
		ArrayList <Integer> list = new ArrayList <Integer>();
		Random random = new Random();
		for (int i = 0; i < limit; i++) {
			list.add(random.nextInt(100));
			System.out.println(list.get(i));
		}
	}
}