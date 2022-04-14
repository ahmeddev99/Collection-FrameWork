package collectionFramework.Part04_statements;

public class F_use_of_java_break {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // 1, 2, 3 -- outer loop	
			for (int j = 1; j <= 3; j++) { // 1, 2, 3 -- inner loop
				if (i == 2 && j == 2) { // 1 1, 1 2, 1 3, 2 1, 3 1, 3 2, 3 3
					// using break statement inside the inner loop
					break;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
