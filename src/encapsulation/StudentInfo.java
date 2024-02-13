package encapsulation;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student ss = new Student("Sovika", 1); //Setting constructor coz Student name and ID are required field
		ss.getStudentId();
		ss.setSSN(6);
		System.out.println( ss.getName() + "  Student ID is " + ss.getStudentId() + " her ssn is " +ss.getSSN());
		System.out.println(ss);
		System.out.println(ss.getSSN());
		ss.setHistory("Nepal");
		System.out.println(ss.getHistory());
		

	}
}
