package YouTube.Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B08_SortList_From_Employee {

	public static void main(String[] args) {
		
		List<B07_Employee> employees = new ArrayList<B07_Employee>();
		employees.add(new B07_Employee(102211, "Shayaan", 10, 11221110));
		employees.add(new B07_Employee(801511, "Majda", 40, 11158040));
		employees.add(new B07_Employee(61210, "Zayn", 05, 12101606));
		employees.add(new B07_Employee(12921, "Azaya", 01, 12921010));
		employees.add(new B07_Employee(40238, "Rubal", 40, 8238140));
		employees.add(new B07_Employee(711225, "Dada", 71, 12255271));
		employees.add(new B07_Employee(32358, "Dadi", 68, 3236368));
		
		System.out.println("\n[------------------ Pass Comparator ------------------]\n");
		Collections.sort(employees, new MySort()); // pass comparator 
		System.out.println(employees);
		
		
		System.out.println("\n\n[------------------ Lambda Expression------------------]\n");
		// Using Lambda expression to implement a comparator interface
		Collections.sort(employees, new Comparator<B07_Employee>() {

			@Override
			public int compare(B07_Employee o1, B07_Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		System.out.println(employees);
		
	}
}



class MySort implements Comparator<B07_Employee> {
    // ^^^ add umimplemented method
	@Override
	public int compare(B07_Employee o1, B07_Employee o2) {
	//	return (int) (o1.getSalary() - o2.getSalary()); // it will print ascending order
		return (int) (o2.getSalary() - o1.getSalary()); // it will print descending order
	}
	
}