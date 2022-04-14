package collectionFramework.Part04_statements;

public class G_use_of_java_continue {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values is: " + i);
		}

		System.out.println("\n---------- for loop after continue 01  ----------\n");
		for (int i = 1; i <= 5; i++) {
			if (i==3) {
				continue;  // if you use continue, this condition will skipped 
			}
			System.out.println("The values is: " + i);
		}
		
		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) { 
			if (i % 2 == 0) { // select the even number and 
				continue; // avoid those even number
			}
			System.out.println("The value is: " + i);
		}
		
		System.out.println("\n---------- for loop after continue 03 ----------\n");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) { // select the odd number and 
				continue; // avoid those odd number
			}
			System.out.println("The value is: " + i);
		}
		
		System.out.println("\n---------- while loop ----------\n");
		int i = 1;
		while (i <= 7) {// when the condition is true, the loop started
			System.out.println("The value is: " + i);
			i++;
		}

		// TODO I will not explain again, no need
		System.out.println("\n---------- while loop after continue ----------\n");
		int j = 1;
		while (j <= 7) {
			if (j == 5) {
				j++; // important info:  this is an exception, because the outcome doesn't go to print  and increment in next line, we use increment here
				continue;
			}
			System.out.println("The value is: " + j);
			j++;
		}
				
		System.out.println("\n---------- do while loop ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k = k + 2;
		} while (k <= 7);

		System.out.println("\n---------- do while loop after continue ----------\n");
		int l = 1;
		do {
			if (l == 5) {
				l=l+2; // this is an exception, because the outcome doesn't go to print  and increment in next line, we use increment here
				continue;
			}
			System.out.println("The value is: " + l);
			l = l + 2;
		} while (l <= 7);
		
		
		
		
		
		
		
		
		
		
	}

}
