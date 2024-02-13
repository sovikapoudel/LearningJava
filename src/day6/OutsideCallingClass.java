package day6;

public class OutsideCallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is from same package, different class");
		System.out.println();
		Car.mycar();
		Car.mycar(4);
		Car.mycar(4, 5);
		Car.mycar(100.5f);

	}

}
