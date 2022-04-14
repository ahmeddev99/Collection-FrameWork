package collectionFramework.Part02;

/*
1) We need to declare size of the array, Different data type (String, char, int etc) can't be mix in an Array

2) Array is fixed size, So, Array is static. a is the array name or object

3) [] called container  

4) length preserve the size of array, not method, field or variable

5) hashCode of the Array, represented by data

6) binary search to get the index position of the value from the reference.

7) As we know that array does not accept mixed data type but if we try to put char in int[] array it will accept and when we print that index value it will show a strange numerical value. Though it looks like a int value but it is actually an ASCII value. At runtime char is converted to ASCII value. That means every char has a specific ASCII value. There is even a specific calculation in the ASCII table. Have a look at the table above. (UseOfArray01.java)  

8) ArrayIndexOutOfBoundsException (UseOfArray01.java)

9) Print all index value from for each loop

10) We can also update value in array

11) We can increase the length of an Array by copyOf(a, 10) method. Declaring size of new array along with old one and now the length is 10.

12) All index value for new Array: Arrays.toString(a)

13) sort() -- > Sorts the specified array of bytes into ascending numerical order.

14) copyOfRange(b, 0, 7) -- > to copy the range of the old array. to copy the range of the old array. from which index to what index (range)// here 0 is starting index and 7 is. length of the index, so last index is 6.

15) Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of booleans are equal to one another. Two arrays are equal if they contain the same elements in the same order. Two array references are considered equal if both are null.

16) equals(a, c)) -- > returns true if the two specified arrays are deeply equal to one another. Two array references are considered deeply equal if both are null, or if they refer to arrays that contain the same number of elements and all corresponding pairs of elements in the two arrays are deeply equal.

17) fill(a, 300) --- > to fill the all the value same, so all value will be changed to 300 here.
a[1] = 106; //If ASCII table have value which represent character then, it will print

 * */


public class InfoOfArray {

	public static void main(String[] args) {

		
	}

}
