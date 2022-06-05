package YouTube.Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class B06_SortingArrayList_In_Asc_And_Desc {

	public static void main(String[] args) {
		
		//create list
		List<Integer> list = new ArrayList<Integer>();
		list.add(70);
		list.add(80);
		list.add(30);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(20);
		
		System.out.println("\n[------------------ Printing without sorting ------------------]\n");
		System.out.println(list);
		
		
		System.out.println("\n\n[------------------ Printing with sorting Ascending Order ------------------]\n");
		Collections.sort(list);    // ascending order
		System.out.println(list);
		
		
		System.out.println("\n\n[------------------ Printing with sorting desceding Order ------------------]\n");
		Collections.reverse(list);  // desceding order
		System.out.println(list);


		
		

	}
}
