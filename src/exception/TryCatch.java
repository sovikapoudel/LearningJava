package exception;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");

		int age = sc.nextInt();
		//int voteage= 18-age;
		sc.close();
		ageCheck(age);
	}

	public static void ageCheck(int age) {
		try {
			if (age >= 18) {
				System.out.println("You can vote");
			} else {
				int votingAge = 18-age;
				throw new Exception("You are under age. Come after " + votingAge +" years");
			}
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		} 
	}
}
