package stringClass;

public class StringClass {

	
	public static void main(String[] args) {

		String name1 = "Sovika"; //String literal
		String name2 = "Sovika";
		
		String s=new String("Sam");
		String p =new String("Sam");
		
		System.out.println(name1.equals(name2)); //true
		System.out.println(s.equals(p)); //true because .equal compares the value
		System.out.println(name1.equals(p)); //false because the value are not same
		System.out.println();
		
		
		System.out.println(s==p);  //Should give false as they points to different memory address/ object in heap memory
		System.out.println(name1 == name2); //True as they are stored in same memory in String pool
	}
	
}
