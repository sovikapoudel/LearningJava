package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList=new LinkedList<Integer>();
		
		
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(11);
		myList.add(12);
		
		System.out.println(myList);
		System.out.println("----------------");
		System.out.println(myList.size());
		System.out.println("-----------------");
		//for each loop
		for (Integer L1 : myList) {
			System.out.println(L1);
		}
		System.out.println("-----------------");
		System.out.println(myList.contains(8));
		System.out.println("-----------------");
		myList.remove(0);
		myList.remove(4);
		System.out.println(myList);


	}

}
