package staticjava;

public class StaticClass {
	static int num1= 123;
	static int num2= 456;
	static int sum = num1+num2;
	
	String name= "Sovika";
	
	public void add() {
		System.out.println( "Number are concatinated: "+ num1 + num2);
		
	}
	
	static public void addition() {
		System.out.println("sum of number is: " + sum);
		
	}
	static {
		
		System.out.println("Thisi is static block and it will be called when the class is accessed");
	}

}
