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
		if (Pattern.matches(
				"^[a-z]+([a-zA-Z0-9]+)*[.]*([a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$", email)) {
			System.out.println("Email is regestried sucessfully");
		} else {
			System.out.println("Email pattern is not matched");
		}

		String[] validEmail = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
		for (String s : validEmail) {
			if (email.equals(s)) {
				System.out.println("email is valid");
			}
		}
		String[] inValidEmail = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				"abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		for (String s : inValidEmail) {
			if (email.equals(s)) {
				System.out.println("email is invalid");
			}
		}
	}

	public void checkPhoneNo() {
		System.out.println("Enter Phone No : ");
		String phoneNo = sc.nextLine();
		if (Pattern.matches("^([1-9]{1}[0-9])?\\s{0,1}[1-9]{1}[0-9]{9}$", phoneNo)) {
			System.out.println("Phone Number is regestried sucessfully");
		} else {
			System.out.println("Phone Number pattern is not matched");
		}
	}

	public void checkPassword() {
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		if (Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.-_!]).*$", password)) {
			System.out.println("password is regestried sucessfully");
		} else {
			System.out.println("password pattern is not matched");
		}
	}
}
