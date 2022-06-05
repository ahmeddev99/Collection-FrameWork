package collectionFramework.Part01_Sohag;

public class E00_Map_Info {

}


/*
Map ---> Interface
implemented class : HashMap   LinkedHashMap  TreeHashMap
HashMap
********
A HashMap --->store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). 
It can store different types: String keys and Integer values, or the same type, like: String keys and String values
No duplicate key
initial capacity 16----based on threshold becomes double
Hash table implementation--elements put in buckets of table based on hash code
**How index is selected: Put(key,value) will call hasCode()----which is responsible to generate hashCode()--->hascod/totalIndex--reminder is the index
 
LinkedHashMap 
************
 
---> LinkedHashMap maintains the insertion order.
LinkedHashMap is a Hash table and linked list implementation of the Map interface, 
with predictable iteration order. This implementation differs from HashMap 
in that it maintains a doubly-linked list running through all of its entries. 
This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order). 
TreeMap //
***********
TreeMap class is a red-black tree based implementation. 
It provides an efficient means of storing key-value pairs in sorted order.
---->Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.
*/