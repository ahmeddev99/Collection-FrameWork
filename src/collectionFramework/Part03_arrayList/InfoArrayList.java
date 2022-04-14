package collectionFramework.Part03_arrayList;
/*
 * Author: Shohag, Organised by: Tofael
 */
/*
Collection Framework: 

1) Collections Framework (introduced in Java 1.2 version)

2) The collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

3) Java collections can achieve all the operations that you perform on data such as searching, sorting, insertion, manipulation, and deletion.

4) Java collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet)…/

Please see image in class Note

5) Iterable Interface: This is the super Interface of Collection Interface. 
The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface. It contains only one abstract method. i.e.,
Iterator<T> iterator()
*<T> specifically stands for generic type. (T is for Type)

All Known Subinterfaces: BeanContext, BeanContextServices, BlockingQueue<E>, Collection<E>, List<E>, Queue<E>, Set<E>, SortedSet<E>

All Known Implementing Classes: AbstractCollection, AbstractList, AbstractQueue, AbstractSequentialList, AbstractSet, ArrayBlockingQueue, ArrayList, AttributeList, BeanContextServicesSupport, BeanContextSupport, ConcurrentLinkedQueue, CopyOnWriteArrayList, CopyOnWriteArraySet, DelayQueue, EnumSet, HashSet, JobStateReasons, LinkedBlockingQueue, LinkedHashSet, LinkedList, PriorityBlockingQueue, PriorityQueue, RoleList, RoleUnresolvedList, Stack, SynchronousQueue, TreeSet, Vector

6) Collection Interface:  The Collection interface is the interface which is implemented by all the classes in the collection framework. It declares the methods that every collection will have. In other words, we can say that the Collection Interface builds the foundation on which the collection framework depends.
A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific sub interfaces like Set and List. 

7) Before Start Learning: Good to Know-> 3Cs
c-collections – concept of collection framework
C-Collections—Class of java.util package
C-Collection –Interface of java.util package
Implements & Extends 
Implements -> An Interface needs to be implemented->only Class can implement an Interface or multiple Interfaces (Java support multiple implementations)
Extends ->As per OOP concept Java allows a Class (child) to extend another Class (parent) AND an Interface extends another Interface (a class can’t extend multiple classes)

8) List Interface
->List interface is the child interface of Collection interface. 
->It inhibits a list type data structure in which we can store the ordered collection of objects. 
->It can have duplicate values.
->List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
To instantiate the List interface, we must use :
1.	List <data-type> list1= new ArrayList();  
2.	List <data-type> list2 = new LinkedList();  
3.	List <data-type> list3 = new Vector();  
4.	List <data-type> list4 = new Stack();  
There are various methods in List interface that can be used to insert, delete, and access the elements from the list.
The classes that implement the List interface are given below.
 
9) ArrayList Class
-- implements the List interface
-- uses a dynamic array
-- duplicate element allowed
-- different data types (Heterogeneous elements are allowed) can be used
-- maintains the insertion order (insertion order will be preserved ->will print as you add)
-- non-synchronized 
-- elements stored in the ArrayList class can be randomly accessed (by using get(indexNuber)
-- stores values in the basis of index
-- null insertion is possible (String)
 
10) Good to know about methods of ArrayList used in code:
-> add(), size(), get()
-> get all values by using for loop, iterator()
-> generic and non generic
-> user-defined class obj
-> addAll()
-> removeAll()
-> retainAll()

11) how an Array is fixed in size but ArrayList is not?
-- 
12)  Why is ArrayList slow? 
-- in case of adding element and removing elements, it needs time for shifting

13) Why is ArrayList a better choice?
-- for data retrieval. For example - 
   ar.get(0); ---- it will take 1 m.sec
   ar.get(1000) ---- it will take 1 m.sec too

14) Interview questions are not added [please remind me]
 Array vs ArrayList:

Array is static in size that is fixed length data structure, one can’t change the length after creating the Array object. 

ArrayList is dynamic in size. Each ArrayList object has instance variable capacity which indicates the size of the ArrayList. As elements are added to an ArrayList its capacity grows automatically.


ArrayList can’t contains primitive data types (like int, float, double) it can only contains Object while Array can contain both primitive data types as well as objects. 

We can use iterator to iterate through ArrayList. The iterators returned by the ArrayList class's iterator and list iterator method are fail-fast. 

We can use for loop or for each loop to iterate through array. 

Length of the ArrayList is provided by the size() method while Each array object has the length variable which returns the length of the array. 

Array can be multi-dimensional, while ArrayList is always single dimensional. 

Arrays are object, ArrayList is a class.
*/

public class InfoArrayList {
	
}
