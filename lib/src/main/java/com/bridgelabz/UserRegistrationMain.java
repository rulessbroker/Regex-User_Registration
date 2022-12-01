package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {

		UserRegistration input = new UserRegistration();

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println(
					"***User Registration***\n1.Enter First Name\n2.Enter Last Name\n3.Enter Email\n4.Enter Phone Number\n5.Password\n6.Exit\nEnter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				input.checkFirstName();
				break;
			case 2:
				input.checkLastName();
				break;
			case 3:
				input.checkEmail();
				break;
			case 4:
				input.checkPhoneNo();
				break;
			case 5:
				input.checkPassword();
				break;
			case 6:
				System.out.println("Exited Successfully!!!");
				break;
			default:
				System.out.println("Enter Valid input!");
			}
		} while (choice != 6);

	}
}
