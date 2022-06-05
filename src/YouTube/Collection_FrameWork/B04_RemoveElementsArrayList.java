package YouTube.Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

// remove
// removeAll
// clear()
public class B04_RemoveElementsArrayList {

	public static void main(String[] args) {
		
		System.out.println("\n[------------------ Adding elemens to lists ------------------]\n");
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Grapes");

		System.out.println(fruits);
		
		
		System.out.println("\n\n[------------------ Removeing first Elements ------------------]\n");
		fruits.remove(4);
		System.out.println("After removing elements at index 4 =>  " + fruits);
		
		
		System.out.println("\n\n[------------------ Removeing second Elements ------------------]\n");
		fruits.remove(2);
		System.out.println("After removing elements at index 2 =>  " + fruits);
		
		
		System.out.println("\n\n[------------------ Removeing All Elements ------------------]\n");
		// Remove all the elements that exist in a given collection
		List< String > subfruitsList = new ArrayList<>();
		subfruitsList.add("Banana");
		subfruitsList.add("Apple");
		
		fruits.removeAll(subfruitsList);
		System.out.println(fruits);
		
		
		System.out.println("\n\n[------------------ clear Elements ------------------]\n");
		fruits.clear();
		System.out.println("After clear elements from the arraylist =>  " + fruits + "  <--Container should be empty");
	}
}
