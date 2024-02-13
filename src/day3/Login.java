package day3;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Username: ");
		String username =  sc.nextLine();
		System.out.println("Enter Pincode: ");
		int pincode = sc.nextInt();
		
		if (username.equalsIgnoreCase("Sovika") && pincode==1234) {
			System.out.println("Login Success!!");
		}
		else if (!username.equals("Sovika") || pincode!=1234) {
			System.out.println("Either usename or pincode not correct");	
		}
		else {
			System.out.println("Login failed!");
		}
		sc.close();
	}

}