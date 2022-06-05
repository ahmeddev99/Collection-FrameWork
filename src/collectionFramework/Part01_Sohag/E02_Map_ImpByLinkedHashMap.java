package collectionFramework.Part01_Sohag;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E02_Map_ImpByLinkedHashMap {

	public static void main(String[] args) {
		Map<Integer,String> map =new LinkedHashMap<>();
		map.put(105, "Laptop");  //--> call hashCode()--gives int number>find reminder for example 2>will choose the index(where our key, value,hasCode,nextnodeaddress will be stored
		map.put(102, "Phone");
		map.put(103, "MacBook pro");	
		map.put(104, "MacBook air");	
		map.put(101, "GalaxiPhone");
		
		Set<Integer>keys=map.keySet();//will give you all keys
		
		//pring all in for each loop
				for(int singleKey:keys) {
					System.out.println(map.get(singleKey));
				}
				
				System.out.println("_________________\n");
				for (int myKey:keys) {
					System.out.println(map.get(myKey));
				}

	}

}
