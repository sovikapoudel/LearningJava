package problemSolving;

public class ClassChallange {
	
	String classwork= " Logic Check";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Question1--------");
		int num1=20;
		String numString= Integer.toString(num1);
		System.out.println(numString);
		System.out.println(numString.getClass()); //Shows its in String class
		System.out.println();
		
		
		System.out.println("-----Question2--------");
		
		//printing pattern
		 int i, j;
	        for (i = 1; i <= 5; i++) {
	            for (j = 1; j <= i; j++) {
	                System.out.print(j+ " ");
	            }
	            System.out.println();
	        }
		//find largest value form given array
		System.out.println();
		System.out.println("-------Question 3-------");
		
		int myArr[] = {1,3,9, 5,6,7};
		int maxValue=myArr[0];
		for(int a=1; a<myArr.length; a++) {
			if (myArr[a]>maxValue){
				maxValue=myArr[a];
			}
		}
		System.out.println("Largest value in my arr is: "+ maxValue);
		
		
		System.out.println();
		System.out.println("----------Question4--------");
		//- Write a Java code to handle multiple exceptions using single catch block.
		
		int mynum1 [] = {1, 3, 5, 6 };
		int mynum2=0;
		
		try { int answer= mynum1[3]/mynum2;
		System.out.println(answer);
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
		
		
		System.out.println("----------Question 5----------");
		//5:- What is inheritence? Write down a code for Multiple Inheritence.
		
		//Inheritance is java is a concept where a class/subclass derive it's attribute and methods from it's parent class
	}
	
	

}
