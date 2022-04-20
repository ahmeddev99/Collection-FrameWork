package collectionFramework.Part01_Sohag;

import java.util.ArrayList;
import java.util.Iterator;


public class A03_ArrayList_PrintingApproach {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList =new ArrayList(10);//12+6=18 
		arrayList.add("Sohag1");
		arrayList.add("Sohag2");
		arrayList.add("Sohag3");
		arrayList.add("Sohag4");
		arrayList.add("Sohag5");

		//pring-single element
		System.out.println(arrayList.get(0));
		//print-multiple elements
		//print-size of the list
		System.out.println(arrayList.size());

		//print all elements:
		//using for loop-
		for(int i=0;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i));
		}

		//using for each loop or advanced loop
		for(String name:arrayList) {
		//if(name=="Sohag3") {}{//if we want to add some condition
		System.out.println(name);
		}

		//fist iterate: name=Sohag1---->so printing Sohag1
		//2nd iterate: name=Sohag2---->so printing Sohag2
		//3nd iterate: name=Sohag3---->so printing Sohag3


		//by using iterator();
		Iterator it=arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//first iterate: hasNext will return ture---->next() will be called which print the element "Sohag1"
		//1nd iterate: hasNext will return ture---->next() will be calledwhich print the element "Sohag1"

		//......
		//hasNext will return false---stop iteration and next() will be not called



		
		
		
	}
}
