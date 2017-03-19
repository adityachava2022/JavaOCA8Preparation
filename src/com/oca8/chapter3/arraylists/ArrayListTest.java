package com.oca8.chapter3.arraylists;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*As with StringBuilder, there are three ways to create an ArrayList: */
			ArrayList list1 = new ArrayList();/*This constructor builds an array list that has the specified initial capacity. The capacity is the size of the underlying array that is used to store the elements. The capacity grows automatically as elements are added to an array list.*/
			/* This constructor builds an array list that has the specified initial capacity.
			 * The capacity is the size of the underlying array that is used to store the elements.
			 * The capacity grows automatically as elements are added to an array list.
			 */
			ArrayList list2 = new ArrayList(10); 
			/* ArrayList(Collection) object */
			ArrayList list3 = new ArrayList(list2);
						
			// with generic only after java 5 , these are allowed.
			ArrayList<String> list4 = new ArrayList<String>();
			ArrayList<String> list5 = new ArrayList<>();  // this is called diamond notation , only after java7
			
			//methods :
			//boolean add(E element) //returns always true
			//void add(int index, E element)
			
			ArrayList list = new ArrayList();
			list.add("hawk"); // [hawk]
			list.add(Boolean.TRUE); // [hawk, true]
			System.out.println(list); // [hawk, true]
			
			ArrayList<String> safer = new ArrayList<>();
			safer.add("sparrow");
		//	safer.add(Boolean.TRUE); // DOES NOT COMPILE due to generic string issue.
			
			//method : remove
			//boolean remove(Object object) // returns false if no match occurred.
			//E remove(int index)  //The E return type is the element that actually got removed
			ArrayList<String> alist = new ArrayList<>();
			alist.add("1");
			alist.add("2");
			alist.add("3");
			alist.add("4");
			alist.add("5");
			alist.add("6");
			alist.add("7");
			alist.add("8");
			System.out.println(alist);
			alist.remove(0);
			System.out.println(alist);
			alist.remove("4");
			System.out.println(alist);
			alist.remove(8);  //java.lang.IndexOutOfBoundsException: Index: 8, Size: 7  
			//method : set
			//E set(int index, E newElement)
			//The E return type is the element that got replaced
			ArrayList<String> alist2 = new ArrayList<>();
			alist2.add("1");
			alist2.add("2");
			alist2.add("3");
			System.out.println(alist2);
			alist2.set(0,"setmethod");
			System.out.println(alist2);
			//clear: void clear()
			alist.clear();
			//size: int size()
			System.out.println(alist.size());
			//isEmpty: boolean isEmpty()
			System.out.println(alist.isEmpty());
	}

}
