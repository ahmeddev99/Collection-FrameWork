package collectionFramework.Part03_arrayList;

import java.util.ArrayList;

public class UseOfArrayList04 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {
		// Generic comes in java 1.5 ---> by defining the type
		// in <> angular method we mention the generic type (Object)
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Mohammad"); // different data type can't be used, only String Type
		ar1.add("Tofael");
		ar1.add("Kabir");
		ar1.add("");
		ar1.add("Sharkar");
		ar1.add("44"); // can it take integer? remove " " and see

		System.out.println("\n^^^^^^^^^^^^^ After using for each loop the new Array List ^^^^^^^^^^^^^^^^ ");
		for (String s : ar1) { // for each loop
			System.out.println(s);
		}

		// Using char type
		ArrayList<Character> ar2 = new ArrayList<Character>();
		ar2.add('A');
		ar2.add('B');
		ar2.add('C');
		// ar2.add(''); //Why it will not work

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of Charcter type ArrayList ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i));
		}

		// Using Integer type
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		ar3.add(483);
		ar3.add(484);
		ar3.add(485);
		// ar31.add(); //Why it will not work

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of Integer type ArrayList ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}

		// user-defined class obj--see the StudyGroup Class in this package
		// Creating obj of the StudyGroup Class by parameterized constructor and passing
		// value:
		StudyGroup s1 = new StudyGroup("Mohammad", 80, "Sharkar");
		StudyGroup s2 = new StudyGroup("Azam", 40, "Sharif");
		StudyGroup s3 = new StudyGroup("Islam", 30, "Sohag");
		StudyGroup s4 = new StudyGroup("Miah", 30, "Sohel");

		// now we can put the obj of the StudyGroup type obj (s1,s2,s3,s4))
		ArrayList<StudyGroup> ar4 = new ArrayList<StudyGroup>();
		ar4.add(s1);
		ar4.add(s2);
		ar4.add(s3);
		ar4.add(s4);

		// print by using for each loop/enhanced for loop/advanced for loop
		System.out.println("\n^^^^^ Printing all the value of user defined class obj ArrayList ^^^^^ ");
		for (StudyGroup sg : ar4) { // sg is a container, where to put the value from the below loop
			System.out.println(sg.fname + " " + sg.lname + " " + sg.age);
		}

	}
}
