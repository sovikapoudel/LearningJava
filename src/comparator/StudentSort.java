package comparator;

import java.util.Comparator;

public class StudentSort implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		
		College s1 = (College) o1;
		College s2=(College) o2;
		
		if (s1.student==s2.student)
			return 0;
		else if (s1.student > s2.student)
			return -1;
		else return 1;
	}

}
