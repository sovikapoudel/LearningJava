package OOP;

public class Cow {

	String color = "black and white";
	int legs = 4;
	String sound = "Moo";

	public void feed() {
		System.out.println("Cows feed on grass");
	}

	public void walk() {
		System.out.println("Cows can walk");
	}

	public void sleep() {
		System.out.println("Cows can sleep 10 hours");
	}

	public void sound() {
		System.out.println("Cows can make a really loud noise");
	}

	public Cow() {
		System.out.println("This is a very good cow ");
	}

	public Cow(String name, int age) {
		System.out.println("This is " + name + " and it is " + age + " years old");
	}

}
