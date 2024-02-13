package exception;

import java.util.Scanner;

public class AirithmeticException {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter 1st number: ");
	
	int num2 =sc.nextInt();
	
	try {
		int answer= num1/num2;
		System.out.println(answer);
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally {
		sc.close();
	}
	}

}
