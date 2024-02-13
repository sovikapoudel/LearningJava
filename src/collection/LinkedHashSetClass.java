package collection;

import java.util.LinkedHashSet;
import java.util.Set;

//only difference is an insertion order
public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> animal =new LinkedHashSet<String>();
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Girraf");
		animal.add("Lion");
		animal.add("Hippo");
		animal.add(null); //takes null value
		
		for(String vl: animal) {
			System.out.println(vl);
		}
		System.out.println(animal.size());

	}

}
