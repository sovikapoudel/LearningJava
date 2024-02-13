package abstraction;

public class Lenovo extends Laptop{

	@Override
	public void sleep() {
		System.out.println("Sleep mode is available in this laptop");
		
	}

	@Override
	public void processor() {
		System.out.println("It has intel core processor");
		
	}

	@Override
	public void internet() {
		System.out.println("Easy internet connection");
		
	}

}
