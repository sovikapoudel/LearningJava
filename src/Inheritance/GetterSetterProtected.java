package Inheritance;

import encapsulation.Student;
// needed to create it's own constructor inorder to invoke the constructor in a parent class and the constructor should follow the parent class constructor rule.


public class GetterSetterProtected extends Student{
	public GetterSetterProtected(String s, int a) {
		super(s, a);
		//when creating the instance of this class using the constructor, it is calling the parent class constructor using super(s, a)
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sts = new Student("Maria", 1);
		sts.getSSN();
		System.out.println(sts);
		
		GetterSetterProtected gs = new GetterSetterProtected("Sovika", 22);
		
		gs.setHistory("NNN");
		gs.getHistory();
		System.out.println(gs);
		

	}

}
