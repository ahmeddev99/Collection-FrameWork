package collectionFramework.Part01_Sohag;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E01_Map_impHashMap {
	
	public static void main(String[] args) {
		//creating HasMap
		Map<Integer,String> map =new HashMap<>();
		map.put(105, "Laptop");  //--> call hashCode()--gives int number>find reminder for example 2>will choose the index(where our key, value,hasCode,nextnodeaddress will be stored
		map.put(102, "Phone");
		map.put(103, "MacBook pro");	
		map.put(104, "MacBook air");	
		map.put(101, "GalaxiPhone");	
		map.put(106, "Samsung");	
		map.put(106, "Samsung1");	//if duplicate key then value will be replaced
		map.put(10, null);	//null value
		map.put(0, "Samsung1");	//duplicate value
		
		System.out.println("\n-------------------Printing Single Value--------------------\n");
		//print/get
		//map.get(101);//--> call hashCode()--gives int number>compare this number with prev number (when used put())
	    //single value by passing single key
		System.out.println(map.get(101));
		
		
		System.out.println("\n\n-------------------Printing all Value--------------------\n");
		Set<Integer>keys=map.keySet();//will give you all keys
		//pring all
		for(int singleKey:keys) {
			System.out.println(map.get(singleKey));
		}
		
		
	}
}
