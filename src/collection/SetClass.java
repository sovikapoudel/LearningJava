package collection;

import java.util.HashSet;
import java.util.Set;

//Set is also dynamic just like list
//O(1)- takes constant time for searching
//Excellent for search

//list is better at manipulating elements, adding/removing.
public class SetClass {
	
	public static void main(String[] args) {
		Set <String> strSet= new HashSet<String>();
		strSet.add("Apple");
		strSet.add(null);
		strSet.add(null); //Even null value is not duplicated
		strSet.add("Banana");
		strSet.add("Orange");
		
		for(String vl: strSet) {
			System.out.println(vl);
		}
		System.out.println();
		System.out.println("Size: " + strSet.size());
	}
}
