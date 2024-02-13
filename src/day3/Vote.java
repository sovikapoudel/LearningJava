package day3;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating Scanner object sc to take user input
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if (age >=18) {
			System.out.println("Yayy!! You are eligible for voting");
		}
		else if (age < 18 & age>0) {
			System.out.println("You are too young to vote. Please come "+ (18-age) +" years later.");
		}
		else {
				System.out.println("Please enter a valid age");
			}
		sc.close();
		}
		}
