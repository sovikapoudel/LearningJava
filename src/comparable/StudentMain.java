package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(2, "Duke", 2000));
		st.add(new Student(7, "NC State", 5000));
		st.add(new Student(9, "ECU", 6000));
	

	Collections.sort(st);
	for(Student s: st)
	{
		System.out.println("roll no: "+ s.roll + " Tuition cost: "+ s.tuition + " College Name: "+ s.college);
	}
}
}


