package collectionFramework.Part01_Sohag;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E03_Map_ImpTreeMap {

	public static void main(String[] args) {
		Map<Integer,String> map =new TreeMap<>();
		map.put(105, "Laptop");  //--> call hashCode()--gives int number>find reminder for example 2>will choose the index(where our key, value,hasCode,nextnodeaddress will be stored
		map.put(102, "Phone");
		map.put(103, "MacBook pro");	
		map.put(104, "MacBook air");	
		map.put(101, "GalaxiPhone");	
		map.put(106, "Samsung");	
		map.put(106, "Samsung1");	//if duplicate key then value will be replaced
		map.put(10, null);	//null value
		//map.put(0, "Samsung1");	//duplicate value
		//print/get
		//map.get(101);//--> call hashCode()--gives int number>compare this number with prev number (when used put())
	    //single gvalue by passing single key
		
		Set<Integer>keys=map.keySet();//will give you all keys
		
		//pring all
		for(int singleKey:keys) {
			System.out.println(map.get(singleKey));
		}
		
		
		Map<String,String> map1 =new TreeMap<>();
		
		map1.put("sohag", "Red");
		map1.put("Noyon", "Blue");
		map1.put("sohag", "Green");
		//map1.put(null, "Yellow"); //null is not possible
		
		Set<String> ky=map1.keySet();
		
		//pring all
		for(String singleKey1:ky) {
			System.out.println(map1.get(singleKey1));
		}
		
		
	}

}
