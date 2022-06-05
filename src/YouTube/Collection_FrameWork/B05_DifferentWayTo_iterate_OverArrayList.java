package YouTube.Collection_FrameWork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class B05_DifferentWayTo_iterate_OverArrayList {
	public static void main(String[] args) {
		
		System.out.println("\n[------------------ Adding elemens to courses ------------------]\n");
		
		List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Python", "Hibernate");
		System.out.println(courses);
		
		
		System.out.println("\n\n[------------------ Using Basic for loop ------------------]\n");
		// How to iterate a list using basic for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		
		System.out.println("\n\n[------------------ Enhanced for Each loop ------------------]\n");
		// Enhanced for each loop
		for (String course: courses) {
			System.out.println(course);
		}
		
		
		System.out.println("\n\n[------------------ Basic loop with iterator ------------------]\n");
		// Basic loop with iterator
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		
		
		System.out.println("\n\n[------------------ iterator with while loop ------------------]\n");
		// iterator with while loop
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		
		System.out.println("\n\n[------------------ Java 8 stream + lambda ------------------]\n");
		// Java 8 stream + lambda example
		courses.stream().forEach(course -> System.out.println(course)); 
/*		
	--	^^ using lambda expression with for each method to iterate over a stream
		
	--	first convert a list(courses) into stream and top of list we use for each method to iterate over stream
	
*/		
		
		
		System.out.println("\n\n[------------------ Java 8 forEach + lambda ------------------]\n");
		courses.forEach((course) -> System.out.println(course));
		
		
	}
}
