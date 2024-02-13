package day3;

import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int num;
		
		do {
			System.out.println("Please enter a valid Positive number: ");
		
		 	while (!sc.hasNextInt()){
		 		System.out.println("Invalid Input! Please enter a number: ");
		 		sc.next(); //consume invalid input and stops infinite loops		 		
		 	}
		num = sc.nextInt();
		
		} while (num<=0);	
		if (num%2 ==0) {
			System.out.println("Your number is Even");
		}
		else if (num%2!=0) {
			System.out.println("Your number is Odd");
		}		
		sc.close();
}}
