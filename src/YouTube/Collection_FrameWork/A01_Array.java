package YouTube.Collection_FrameWork;

import javax.print.attribute.standard.JobHoldUntil;
import javax.xml.crypto.Data;

public class A01_Array {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 30;
		int e = 30;
		int f = 30;
		int g = 30;
		int i = 30;
		int j = 30;
		int k = 30;
		
	//	Array is Data structure which can hold alot of data
	
	// [] --> called container
		
		int[] arArray = new int[10000]; // main advantage of array is that we can store multiple values with single variable
		
	// variable = ^ arArray
	// Arrays are fixed in size so once we coreate an array there is no chance to increasing or decreasing the size of an array as per our requirement
	
		// the main limitation of an array
		//  1. Array are fixed in size
		//  2. can only hold same or similar type of data elements and cannot store different type of elements in Array
		
		Student [] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
//		students[2] = new Book();  // cannot store different type of elements in Array

//   Array object to store a different types of elements	
		Object[] objects = new Object[10];
		objects[0] = new Student();
		objects[1] = new Student();
		objects[2] = new Book(); 
		
		// 3. ready made API's support is not available in Array
		// Array does not provide a ready-made API's to work with data structures or algorithms
		
		
		// Homogeneous --> data structure (elements have same data type) that stores a sequence of consecutively numbered objects--allocated in contiguous memory. 
		//                 Each object of the array can be accessed by using its number
		
		// Heterogeneous --> "homo-" means same, "hetero-" means different. In any case if a single Java array can only store one type, say, only numbers, or only strings then 
		// it is homogeneous. If multiple types then heterogeneous. In the above case, since collection is of Object type and can hold any type.
	}
}

 class Book {
	 
 }
 class Student {
	 
 }














