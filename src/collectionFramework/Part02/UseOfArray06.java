package collectionFramework.Part02;

import java.util.Arrays;

public class UseOfArray06 {

	public static void main(String[] args) {

		String[] ay = new String[] { "First", "Second", "Third", "Fourth", "Fifth" };
		// Literal representation of an String type Array

		// Print the array using default toString method - Do not Use it
		// System.out.println(ay.toString());

		// Print the array using Arrays.toString() - "RECOMMENDED for simple arrays"
		System.out.println(Arrays.toString(ay));

		// No need
		String[] arr1 = new String[] { "hundred", "hundred One" };
		String[] arr2 = new String[] { "two hundred", "thirty four" };

		// An array of array containing String objects //double dimension -- important
		String[][] newArray = new String[][] { arr1, arr2 };

		// Compare the different outputs
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(newArray)); // providing Array ID, so not giving value

		// Print the array using Arrays.deepToString() - "RECOMMENDED for
		// multi-dimensional array"
		System.out.println(Arrays.deepToString(newArray));

	}
}
