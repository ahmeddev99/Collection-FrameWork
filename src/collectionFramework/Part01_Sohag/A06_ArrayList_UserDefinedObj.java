package collectionFramework.Part01_Sohag;

import java.util.ArrayList;

//In this class we will see how we can make ArrayList<userDefinedObj type generic>
//We have created one class--EnthrallSt  now we will create some obj so that we can add in arryList

import java.util.Iterator;

public class A06_ArrayList_UserDefinedObj {
	
	public static void main(String[] args) {
		
		//creating objects of of our own class
				A06_EnthrallSt st1= new A06_EnthrallSt("Ryhan",25);
				A06_EnthrallSt st2= new A06_EnthrallSt("Fatima",24);
				A06_EnthrallSt st3= new A06_EnthrallSt("Kanta",22);
				
				//creating arrayList obj
				ArrayList<A06_EnthrallSt> arrList=new ArrayList<>();
				//by calling add()--adding our EnthrallSt type obj
				arrList.add(st1);
				arrList.add(st2);
				arrList.add(st3);
				
	 //     	print name variable of the specific obj---by using for each loop
     //			for( EnthrallSt singObj:arrList) {
     //			System.out.println(singObj.name);
     //			}
		
				
				
				
		 //     by iterator()
				Iterator<A06_EnthrallSt> it=arrList.iterator();
				while(it.hasNext()) {
					System.out.println(it.next().age);
				}
		
	}
}
