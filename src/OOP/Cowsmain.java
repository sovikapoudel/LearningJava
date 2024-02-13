package OOP;

public class Cowsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow cw = new Cow();
		System.out.println("This cow is " + cw.color);
		System.out.println("This cow has  " + cw.legs + " legs");
		System.out.println("This cow makes " + cw.sound + " sound");
		System.out.println();

		cw.sound();
		cw.feed();
		cw.sleep();
		cw.walk();
		System.out.println("________________________");
		System.out.println();
		
		Cow cc = new Cow("Buddy", 9);
		cc.sound();
		cc.feed();
		cc.sleep();
		cc.walk();
		System.out.println("This cow is " + cc.color);


	}

}
