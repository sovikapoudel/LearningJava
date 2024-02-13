package abstraction;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop lp = new Lenovo();
		lp.sleep();
		lp.start();
		lp.stop();
		lp.processor();
		lp.internet();
				
	}

}
