package collectionFramework.Part04_statements;

public class H_use_of_java_continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // outer loop -- 1, 2, 3
			for (int j = 1; j <= 3; j++) { // inner loop -- 1, 2, 3
				if (i == 2 && j == 2) {
					// using continue statement inside inner loop
					continue;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
