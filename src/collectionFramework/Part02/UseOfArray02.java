package collectionFramework.Part02;

import java.util.Arrays;

public class UseOfArray02 {

	public static void main(String[] args) {
		
		int [] a = new int [] {15, 34, 59, 5, 28, 12}; 
		//Above is the alternate way to write Array, called literal representation
		// I didn't present - like a[0]=15. no need to write that way, if you literally present the value inside the Array
		System.out.println("\n------------- Printing single index value -------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]);// output: ?
		System.out.println("Printing single index value: " + a[4]);// output: ?
		System.out.println("Printing single index value: " + a[1]);// output: ?
		System.out.println("Printing single index value: " + a[2]);// output: ?
		
		System.out.println("First index value: " + a[0]);
		System.out.println("Second last index value: " + a[a.length - 2]); // important
		System.out.println("Last index value: " + a[a.length - 1]); // important
		System.out.println("To find the list of an (or what is inside the array) Array: " + Arrays.toString(a) + "\n");
		
		Arrays.sort(a); // Sorts the specified array of bytes into ascending numerical order.
		System.out.println("After sorting, To find the list of an (or what is inside the array) Array: " + Arrays.toString(a) + "\n");
		
		// How to find the smallest and largest number from an Array?
		// Answer: First sort the Array, then a[0]=smallest, a[a.length-1]=largest
		
		System.out.println("Smallest value of Array is: " + a[0]);
		System.out.println("Largest value of Array is: " + a[a.length - 1]);
		
		}

}

/*
 * 
 * Info regarding this array: java.util.Arrays Class-->This class contains
 * various methods for manipulating array (such as sorting and searching).
 * 
 * 
 * 1. Arrays.sort(ref);--->sorts the specified array of bytes into ascending
 * numerical order.
 * 
 * 
 * 2. x Arrays.asList(ref); ---->convert to Integer Array as List //ref means ref
 * variable of the array //This method returns a fixed-size list backed by the
 * specified Arrays.
 * 
 * 3. Arrays.binarySearch(ref,value); ---->to get the index positiuon of the
 * value form the ref
 * 
 * 4. Arrays.copyOf(ref, 4); --->to copy ref array all index value and fix the
 * length of the new array
 * 
 * 5. Arrays.copyOfRange(ref, 1, 7); ---> to copy the range of the old array
 * from which index to what index (range)// here 1 is starting index and 7 is
 * lenth of the index, so last index is 6
 * 
 * 6. x Arrays.deepEquals(ref1,ref2)----> returns true if the two specified arrays
 * are deeply equal to one another. Two array references are considered deeply
 * equal if both are null, or if they refer to arrays that contain the same
 * number of elements and all corresponding pairs of elements in the two arrays
 * are deeply equal.
 * 
 * 7. Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of
 * booleans are equal to one another. Two arrays are equal if they contain the
 * same elements in the same order. Two array references are considered equal if
 * both are null.
 * 
 * 8. x Arrays.deepHashCode(ref);----> to get the hashcode of the array (int
 * value)
 * 
 * 
 * 8. Arrays.fill(ref, value);--->to fill the all the value same //confused
 * 
 * 
 * 9. Arrays.toString(b1));--->to convert the value to String
 * 
 * 
 * 10. Arrays.mismatch(ref1, ref2));---to find the mismatch
 * 
 * 11. x Arrays.compareUnsigned(ref1, ref2));
 * 
 * 12. Arrays.compare(ref1, ref2));
 * 
 
 */

