package collectionFramework.Part01_Sohag;

import java.util.Iterator;
import java.util.LinkedList;

public class C01_LinkedList_UserDefinedObj {

	public static void main(String[] args) {
		A07_EnthrallSt student1=new A07_EnthrallSt("Tanushree", 25);
		A07_EnthrallSt student2=new A07_EnthrallSt("Farima", 24);
		A07_EnthrallSt student3=new A07_EnthrallSt("Faisal", 28);
		

		
		LinkedList<A07_EnthrallSt> stList=new LinkedList<>();
		stList.add(student1);
		stList.add(student2);
		stList.add(student3);
		
	
		System.out.println(stList.size());	
		for(A07_EnthrallSt singleSt:stList) {
			System.out.println(singleSt.name);
		}
		

	}
}
