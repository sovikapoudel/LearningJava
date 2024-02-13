package abstraction;

public abstract class Laptop {

	public void start() {
		System.out.println("Laptop starts!!");
	}

	public void stop() {
		System.out.println("Laptop turns off if not used for 30 minutes !!");
	}
	
	public abstract void sleep();
	public abstract void processor();
	public abstract void internet();
	
	
}
