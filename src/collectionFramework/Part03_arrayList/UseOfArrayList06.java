package collectionFramework.Part03_arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Author: Shohag, Organised by: Tofael
 */
public class UseOfArrayList06 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Please enter a number");
			ar.add(sc.nextInt());
		}
		sc.close(); // closing Scannar obj
		System.out.println("Here is your result: " + ar);
	}
}