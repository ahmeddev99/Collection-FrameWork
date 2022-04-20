package collectionFramework.Part01_Sohag;

import java.util.Iterator;
import java.util.LinkedList;

public class C01_LinkedList_UserDefinedObj {

	public static void main(String[] args) {
		A06_EnthrallSt student1=new A06_EnthrallSt("Tanushree", 25);
		A06_EnthrallSt student2=new A06_EnthrallSt("Farima", 24);
		A06_EnthrallSt student3=new A06_EnthrallSt("Faisal", 28);
		

		
		LinkedList<A06_EnthrallSt> stList=new LinkedList<>();
		stList.add(student1);
		stList.add(student2);
		stList.add(student3);
		
	
		System.out.println(stList.size());	
		for(A06_EnthrallSt singleSt:stList) {
			System.out.println(singleSt.name);
		}
		

	}
}
