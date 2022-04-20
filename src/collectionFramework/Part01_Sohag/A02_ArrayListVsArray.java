package collectionFramework.Part01_Sohag;

import java.util.ArrayList;


public class A02_ArrayListVsArray {

	public static void main(String[] args) {
		
		int ar[]= {5,8,9,10};
		//System.out.println(ar[3]);

		//printing all by using for each loop

		for(int single:ar) {
			System.out.println(single);
		}

		int arr1[]=new int[3];
				
//---------------------------------------------------------------------------------------------				
			
		ArrayList arrayList =new ArrayList();//12+6=18 
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add("s");
		arrayList.add(50);//3 position
		arrayList.add(15);//4
		arrayList.add(505);
		arrayList.add(505);
		arrayList.add(505);
		arrayList.add(505);
		arrayList.add(505);
		arrayList.add(505);
		arrayList.add(505.5);
		arrayList.add("sohag");

		//print by index
		//System.out.println(arrayList.get(2));

		//addAll()


		//create another arrayList
		ArrayList<Integer> arrayList1 =new ArrayList();

		arrayList1.add(100);

		arrayList1.addAll(arrayList);

		for(int single:arrayList1) {
			System.out.println(single);
		}	
		

//---------------------------------------------------------------------------------------------	
		
		
		String nameString = "Sohag";
		String nameString1 = "Rayhan";
		
		String array[] = new String[10];
		array[0] = "sohag";
		array[1] = "tohag";
		array[2] = "rohag";
		array[3] = "nohag";
		array[4] = "yohag";
		array[5] = "wohag";
		array[6] = "lohag";
		array[7] = "mohag";
		array[8] = "pohag";
		array[9] = "aohag";
		
		// single elements print
		System.out.println("Testing cool stuff " + array[8]);
		
		// print all elements
		for(int i=0; i<12; i++) {
			System.out.println(array[i]);
		}
		

//---------------------------------------------------------------------------------------------	
		
		
		ArrayList<String> arrayList9 = new ArrayList();
		arrayList9.add("Stohag");
		arrayList9.add("Stahag");
		arrayList9.add("Stbhag");
		arrayList9.add("Stchag");
		arrayList9.add("Sthag");
		arrayList9.add("Stdhag");
		arrayList9.add("Stmhag");
		arrayList9.add("Sthhag");
		arrayList9.add("Stihag");
		arrayList9.add("Stphag");
		arrayList9.add("Stjhag");
		arrayList9.add("Stwhag");
		
		// single element
		System.out.println(arrayList.get(0));
		
		// size of the element
		System.out.println(arrayList.size());
		
		// print all
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
