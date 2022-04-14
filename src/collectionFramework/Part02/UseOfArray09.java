package collectionFramework.Part02;

import java.util.Scanner;

// scanner is working now -- put a number then enter, then repeat till 5th number
// you will see the outcome of a[3], a[4] and a[2]

public class UseOfArray09 {

	public static void main(String[] args) {
		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter some integer value: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			// System.out.println(a[i]); //what will happen if you comment out it
		}
		// what will happen if you print string instead of int : nextLine()
		System.out.println("\nThe value in index 3 is: " + a[3]);
		System.out.println("\nThe value in index 4 is: " + a[4]);
		System.out.println("\nThe value in index 2 is: " + a[2]);
		sc.close();
	}
}
