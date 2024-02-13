package staticjava;

public class StaticClassMain {

	public static void main(String[] args) {
		StaticClass sc= new StaticClass();
		// TODO Auto-generated method stub
		sc.add();
		StaticClass.addition();
		System.out.println(StaticClass.num1);
		System.out.println(sc.name);

	}

}
