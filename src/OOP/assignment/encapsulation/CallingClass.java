package OOP.assignment.encapsulation;

public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDataUnitClass sc = new SingleDataUnitClass();
		
		sc.setName("Sovika");
		sc.setStudentId(268598);
		sc.setSemester("Fall");
		sc.setGPA(4);
		
		System.out.println(sc.getName());
		System.out.println(sc.getStudentId());
		System.out.println(sc.getSemester());
		System.out.println(sc.getGPA());
		System.out.println();
		
		System.out.println(sc);

	}

}
