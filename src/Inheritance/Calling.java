package Inheritance;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent pp= new Parent();
		
		pp.eat();
		pp.hair();
		
		
		Child cc = new Child();
		cc.eat();
		
		Grandchild gc = new Grandchild();
		gc.eat();
	}

}
