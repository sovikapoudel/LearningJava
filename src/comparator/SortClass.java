package comparator;

import java.util.ArrayList;

import java.util.Collections;

public class SortClass {
	public static void main(String[] args) {
        ArrayList<College> clg = new ArrayList<College>();

        clg.add(new College(1998, "ABC University", 11200));
        clg.add(new College(1992, "BCD University", 1200));
        clg.add(new College(1999, "CDE University", 13200));
        clg.add(new College(1918, "DEF University", 12300));
        System.out.println("Before Sorting =:");

        System.out.println(" ");

        for (College cl : clg) {
            System.out.println("Year: "+ cl.year + ", Name: " + cl.name + ", Number of Student: " + cl.student);
        }

        System.out.println(" ");
        System.out.println("After Sorting on the basis of Student=:");

        System.out.println(" ");
		Collections.sort(clg, new StudentSort());
		for (College cl : clg) {
            System.out.println("Year: "+ cl.year + ", Name: " + cl.name + ", Number of Student: " + cl.student);
        }

}
}
