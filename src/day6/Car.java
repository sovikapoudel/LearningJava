package day6;

public class Car {
	
	public static void mycar() {
		System.out.println("You car is Tesla");
	}
	public static void mycar(String name) {
		System.out.println("This is " + name);
	}
	public static void mycar(int wheel) {
		System.out.println("Your car have "+ wheel + " wheels" );
	}
	public static void mycar(int wheel, int seat) {
		System.out.println("My car have "+ wheel + " wheels"+ " and "+ seat+ " seats");
	}
	public static void mycar(float milage) {
		System.out.println("My car gives "+ milage+ " miles per hour");
	}

	public static void main(String[] args) {
		Car.mycar();
		Car.mycar(4);
		Car.mycar(4, 5);
		Car.mycar(100.5f);

	}

}
