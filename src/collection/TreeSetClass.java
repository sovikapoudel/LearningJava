package collection;

import java.util.Set;
import java.util.TreeSet;
//does not accept null value, throws null pointer exception
//sorted element
//does not accept duplicates
//sort in ascending order
public class TreeSetClass {

	public static void main(String[] args) {
		Set<String> fruit = new TreeSet<String>();
		fruit.add("Pineapple");
		fruit.add("Pinkfruit");
		fruit.add("Orange");
		fruit.add("Blueberry");
		fruit.add(" ");
		//fruit.add(null); //does not accept null value, throws null pointer exception
		
		System.out.println("size:" + fruit.size());
		for (String vl: fruit) {
			System.out.println(vl);
		}
		
	}

}
