package collectionFramework.Part01_Sohag;


/*

	The stack is the subclass of Vector. 
	models and implements Stack data structure
	It implements the last-in-first-out data structure, i.e., Stack. 
	The stack contains all of the methods of Vector class 
	and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

--> Methods in Stack class <--

1.  Object push(Object element) :--> to Add element (Pushes an element on the top of the stack.)
2.  Object pop() :--> to delete element( Removes and returns the top element of the stack. An ‘EmptyStackException’ 
    exception is thrown if we call pop() when the invoking stack is empty.)
3.  Object peek() :--> to find Element Returns the element on the top of the stack, but does not remove it.
4.  boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.
5.  int search(Object element) : It determines whether an object exists in the stack. If the element is found, it returns 
    the position of the element from the top of the stack. Else, it returns -1.

*/



import java.util.Stack;

public class C05_Stack_usingMethods {
	
	
	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		//System.out.println(list.size());//0
		list.add(5);//adding first==tail
		list.push(10);
		list.push(100);
		list.push(10000);
		list.push(1110);
		list.push(22);
		list.push(3);
		list.push(888);//adding last==head
		
		System.out.println("\n------------ search ------------------\n");
		System.out.println(list.search(10000));//it returns the position
		
		System.out.println("\n------------ size ------------------\n");
		System.out.println(list.size());
		//System.out.println(list.peek());//return the top element
		//System.out.println(list.pop());//return the top element and remove
		
		System.out.println("\n------------ peek ------------------\n");
		System.out.println(list.peek());  // peek will return the top element
		
		System.out.println("\n------------ pop ------------------\n");
		System.out.println(list.pop());
		
		System.out.println("\n------------ size & pop ------------------\n");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.pop());
		}
		
		
		System.out.println("------------ hardcode Pop ------------------");
		for(int i=0;i<8;i++) {
			System.out.println(list.pop());
		}
		
		//as we removed every obj--no more element
		
		//System.out.println(list.size());//0
		System.out.println(list.empty());
		
		
		
		
		
	}
}
