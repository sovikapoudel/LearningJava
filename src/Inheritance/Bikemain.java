package Inheritance;

public class Bikemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******** Parent Class ********");
		Bike bb;
		bb = new Bike();
		bb.run();
		bb.drive();
		System.out.println("This is " + bb.make + " inheriting from bike class");
		System.out.println();
		SuperBike sb = new SuperBike();
		System.out.println("******** Child Class ********");
		sb.run();
		sb.speed();
		sb.drive();
		sb.version();
		
		System.out.println();
		System.out.println("****** Upcasting *******");
		
		bb = new SuperBike();
		bb.drive();
		System.out.println(bb.cost);
		
		System.out.println();
		System.out.println("****** Downcasting *******");
		
		SuperBike dd = (SuperBike) bb;
		dd.drive();
		dd.version();
		dd.speed();
		System.out.println(dd.cost);
		
		

	}

}
