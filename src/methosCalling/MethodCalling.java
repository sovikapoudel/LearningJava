package methosCalling;

import day6.Car;

public class MethodCalling {

	public static void main(String[] args) {
		
		System.out.println("This is from different package");
		System.out.println();
		Car.mycar();
		Car.mycar(4);
		Car.mycar(4, 5);
		Car.mycar(100.5f);
	}

}
