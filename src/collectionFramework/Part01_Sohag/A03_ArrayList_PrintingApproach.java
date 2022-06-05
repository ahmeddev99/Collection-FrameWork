package collectionFramework.Part01_Sohag;

import java.util.ArrayList;
import java.util.Iterator;


public class A03_ArrayList_PrintingApproach {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList =new ArrayList<String>(10);//12+6=18 
		arrayList.add("Sohag1");
		arrayList.add("Sohag2");
		arrayList.add("Sohag3");
		arrayList.add("Sohag4");
		arrayList.add("Sohag5");

		System.out.println("\n\n|---------------> Get <---------------|\n");
		//pring-single element
		System.out.println(arrayList.get(0));
		
		System.out.println("\n\n|---------------> Size <---------------|\n");
		//print-multiple elements
		//print-size of the list
		System.out.println(arrayList.size());

		System.out.println("\n\n|---------------> For Loop Size <---------------|\n");
		//print all elements:
		//using for loop-
		for(int i=0;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i));
		}

		System.out.println("\n\n|---------------> For Name <---------------|\n");
		//using for each loop or advanced loop
		for(String name:arrayList) {
		//if(name=="Sohag3") {}{//if we want to add some condition
		System.out.println(name);
		}

		//fist iterate: name=Sohag1---->so printing Sohag1
		//2nd iterate: name=Sohag2---->so printing Sohag2
		//3nd iterate: name=Sohag3---->so printing Sohag3

		System.out.println("\n\n|---------------> ITERATOR <---------------|\n");
		//by using iterator();
		Iterator it=arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//first iterate: hasNext will return ture---->next() will be called which print the element "Sohag1"
		//1nd iterate: hasNext will return ture---->next() will be calledwhich print the element "Sohag1"

		//......
		//hasNext will return false---stop iteration and next() will be not called
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
	
		// Make Collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("--------printing withour Iterato----------r");
		System.out.println(cars);
		
		
		System.out.println("\n\n|---------------> ITERATOR 2nd Example<---------------|\n");
		// Get the iterator
		Iterator<String> it1 = cars.iterator();
		
		// Printing the first item
		System.out.println(it1.next());



		
		
		
	}
}
