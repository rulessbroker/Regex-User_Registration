package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);

	public boolean checkFirstName(String firstName) {
		System.out.println("Enter first name start with Capital letter :");
		firstName = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
			System.out.println("first name is regestried sucessfully");
			return true;
		} else {
			System.out.println("first name pattern is not matched");
			return false;
		}
	}

	public boolean checkLastName(String lastName) {
		System.out.println("Enter Last name start with Capital letter : ");
		lastName = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
			System.out.println("Last name is regestried sucessfully");
			return true;
		} else {
			System.out.println("Last name pattern is not matched");
			return false;
		}
	}

	public boolean checkEmail(String email) {
		System.out.println("Enter Email : ");
		email = sc.nextLine();
		if (Pattern.matches(
				"^[a-z]+([a-zA-Z0-9]+)*[.]*([a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$", email)) {
			System.out.println("Email is regestried sucessfully");
			return true;
		} else {
			System.out.println("Email pattern is not matched");
			return false;
		}

	}

	public boolean checkPhoneNo(String phoneNo) {
		System.out.println("Enter Phone No : ");
		phoneNo = sc.nextLine();
		if (Pattern.matches("^([1-9]{1}[0-9])?\\s{0,1}[1-9]{1}[0-9]{9}$", phoneNo)) {
			System.out.println("Phone Number is regestried sucessfully");
			return true;
		} else {
			System.out.println("Phone Number pattern is not matched");
			return false;
		}
	}

	public boolean checkPassword(String password) {
		System.out.println("Enter Password : ");
		password = sc.nextLine();
		if (Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.-_!]).*$", password)) {
			System.out.println("password is regestried sucessfully");
			return true;
		} else {
			System.out.println("password pattern is not matched");
			return false;
		}
	}
}
