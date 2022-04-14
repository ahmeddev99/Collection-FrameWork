package collectionFramework.Part03_arrayList;

public class StudyGroup {
	//declaring some variables
	
	public String fname;
	public int age;
	public String lname;
	
	public StudyGroup() {
		System.out.println("defauly constructor");
	}
	
	//creating parameterized constructor
	public StudyGroup(String fname, int age, String lname){
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		
	}

}

