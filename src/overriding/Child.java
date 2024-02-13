package overriding;

public class Child extends Parent{
	@Override
	public void walk() {
		System.out.println("I can walk 5 miles");
	}
	
	public void check() {
		
		super.walk();
		this.walk();
	}

}
