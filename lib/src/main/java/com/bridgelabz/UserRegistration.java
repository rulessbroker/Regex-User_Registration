package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);

	public void checkFirstName() {
		System.out.println("Enter first name start with Capital letter :");
		String firstName = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
			System.out.println("first name is regestried sucessfully");
		} else {
			System.out.println("first name pattern is not matched");
		}
	}

	public void checkLastName() {
		System.out.println("Enter Last name start with Capital letter : ");
		String lastName = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
			System.out.println("Last name is regestried sucessfully");
		} else {
			System.out.println("Last name pattern is not matched");
		}
	}

	public void checkEmail() {
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		if (Pattern.matches("^[a-z]+([a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$", email)) {
			System.out.println("Email is regestried sucessfully");
		} else {
			System.out.println("Email pattern is not matched");
		}
	}
}
