package overriding;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone pp = new Phone();
		pp.ram();
		
		SmartPhone sp = new SmartPhone();
		sp.ram();
		System.out.println();
		sp.display();

	}

}
 