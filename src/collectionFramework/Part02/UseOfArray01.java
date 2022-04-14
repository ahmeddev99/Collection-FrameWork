package collectionFramework.Part02;

import java.util.Arrays;

public class UseOfArray01 {

	public static void main(String[] args) {

		int[] a = new int[5]; // declaring size of the array,
		// Array is fixed size (Array is static)
		// a is the array name
		// [] called container
		// Mixed data type can't be used, example: int and String can't mixed

		a[0] = 5;
		a[1] = 15;
		a[2] = 'j'; // why the outcome is 106 when we use character type? Explained at the end

		a[4] = 56;

		System.out.println("\n------------- Printing single index value ------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]);// output: ?
		System.out.println("Printing single index value: " + a[4]);// output: ?
		System.out.println("Printing single index value: " + a[1]);// output: ?
		System.out.println("Printing single index value: " + a[2]);// output: ?
		// System.out.println("Printing single index value: " + a[5]);// output:
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		// out of bounds for length 5
		// interview question: ArrayIndexOutOfBoundsException

		System.out.println("\nThe length of the array is: " + a.length); // interview question
		// length preserve the size of array, length is not a method, field or variable,
		// rather a parameter

		System.out.println("\nNow The length of the array is: " + (a.length - 1)); // for understanding the next line

		// Que: how can you find the last number from an array?
		// {5, 15, 50, 0, 56}
		// a[4] = a[5-1]= a [a.length-1]
		System.out.println("\nPrinting the last number of the Array: " + a[a.length - 1]); // find the value for
																							// (length-1) no.

		// Que: how can you find the second last number from an array?
		// Ans: a[a.length-2]

		// java.util.Arrays Class --> This class contains various methods for
		// manipulating arrays (such as sorting and searching).
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 56));
		// binary search to get the index position of the value from the ref

		System.out.println("To find the list of an Array: " + Arrays.toString(a) + "\n");

		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + a); // Array ID

		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(a));
		// hashCode of the Array used for representation of array by data

		/*
		 * 
		 * Note: As we know that array does not accept mixed data type but if we try to
		 * put char in int[] array it will accept and when we print that index value it
		 * will show a strange numerical value. Though it looks like a int value but it
		 * is actually an ASCII value. At runtime char is converted to ASCII value. That
		 * means every char has a specific ASCII value. There is even a specific
		 * calculation in the ASCII table. Have a look at the table.
		 * 
		 */
	}

}
