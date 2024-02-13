package comparable;

public class Student implements Comparable<Student>{
	
	int roll;
	String college;
	int tuition;
	
	Student(int roll, String college, int tuition){
		this.roll= roll;
		this.college=college;
		this.tuition=tuition;
		
	}

	@Override
	public int compareTo(Student s) {
		if (roll==s.roll)
			return 0;
		else if (roll>s.roll)
			return 1;
		else
			return -1;
	}

}
