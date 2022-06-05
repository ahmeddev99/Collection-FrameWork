package YouTube.Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//   How to create an ArrayList from another collection using the
//   ArrayList (Collection ) constructor.

//   How to add all the element from an existing collection to the new
//   ArrayList using the addAll() method.

public class B02_CreatingArrayListFromCollectionexample {
	public static void main(String[] args) {
		
		System.out.println("\n[------------------ firstFivePrimeNumber ------------------]\n");
		// create arrayList object
		/* 
		 --> using Intege wrapper class to store prime number because arrayList dont support
		     primitive type we have to use wrapper classess 
		*/         // - firstFivePrimeNumber -->reference variable name
		List<Integer> firstFivePrimeNumber = new ArrayList<>();
		firstFivePrimeNumber.add(2);
		firstFivePrimeNumber.add(3);
		firstFivePrimeNumber.add(5);
		firstFivePrimeNumber.add(7);
		firstFivePrimeNumber.add(11);
		System.out.println(firstFivePrimeNumber);
		
		System.out.println("\n\n[------------------ firstTenPrimeNumber ------------------]\n");
		// create arraylist from another collection
		List<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber); 
		// ^^ arraylist constructor has a parameter collection because arraylist internally implements list interface and list interface extends collections interface
		// so that's why we always prefer to provide super class or super interface
		System.out.println(firstTenPrimeNumber);
		
		
		System.out.println("\n\n[------------------ nextFivePrimeNumber ------------------]\n");
		List<Integer> nextFivePrimeNumber = new ArrayList<>();
		nextFivePrimeNumber.add(13);
		nextFivePrimeNumber.add(17);
		nextFivePrimeNumber.add(19);
		nextFivePrimeNumber.add(23);
		nextFivePrimeNumber.add(29);
		System.out.println(nextFivePrimeNumber);
		
		
		System.out.println("\n\n[------------------ Adding All ------------------]\n");
		firstTenPrimeNumber.addAll(nextFivePrimeNumber);
		System.out.println(firstTenPrimeNumber);
		
	
		
	}
}
