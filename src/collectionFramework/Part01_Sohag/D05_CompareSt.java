package collectionFramework.Part01_Sohag;

import java.util.Comparator;

public class D05_CompareSt  implements Comparator<A07_EnthrallSt>{

	@Override
	public int compare(A07_EnthrallSt student1, A07_EnthrallSt student2) {
		if (student1.age<student2.age) {
			return 1;
		} else {
			return -1;
		}
	}
	

}
