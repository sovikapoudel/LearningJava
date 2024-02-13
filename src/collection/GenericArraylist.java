package collection;

import java.util.ArrayList;

public class GenericArraylist {

	public static void main(String[] args) {
		ArrayList<String> country = new ArrayList<String>(); //generic String type
		country.add("USA");
		country.add("Mexico");
		country.add("Canada");
		country.add("Japan");
		country.add("Korea");
		
		System.out.println(country);
		System.out.println(country.size()); //5
		country.remove(0); // removes USA
		System.out.println(country.size()); //4
		country.clone();
		System.out.println(country.size()); //clone the latest list
		
		
	}

}
