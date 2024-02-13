package day3;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st number:"  );
		int num1 = sc.nextInt();
		System.out.println("Enter your 1st number:"  );
		int num2 = sc.nextInt();
		int sum = num1 +num2;
		System.out.println("Number 1 is : " + num1);
		System.out.println("Number 2 is : " + num2);
		System.out.println("Sum is : " + sum);
		sc.close(); // closing and sc object prevents from memory wastage or memory leak. 

	}
	

}
