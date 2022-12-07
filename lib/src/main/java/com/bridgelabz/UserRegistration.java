package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);

	public Validator firstName = (firstName) -> {
		System.out.println("Enter first name start with Capital letter :");
		firstName = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
			System.out.println("first name is regestried sucessfully");
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid First Name => " + firstName);
		}
	};

	public Validator lastName = (lastName) -> {
		System.out.println("Enter Last name start with Capital letter : ");
		lastName = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
			System.out.println("Last name is regestried sucessfully");
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid Last Name => " + lastName);

		}
	};

	public Validator email = (email) -> {
		System.out.println("Enter Email : ");
		email = sc.nextLine();
		if (Pattern.matches(
				"^[a-z]+([a-zA-Z0-9]+)*[.]*([a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$", email)) {
			System.out.println("Email is regestried sucessfully");
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid email => " + email);
		}

	};

	public Validator phoneNo = (phoneNo) -> {
		System.out.println("Enter Phone No : ");
		phoneNo = sc.nextLine();
		if (Pattern.matches("^([1-9]{1}[0-9])?\\s{0,1}[1-9]{1}[0-9]{9}$", phoneNo)) {
			System.out.println("Phone Number is regestried sucessfully");
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid Mobile Number => " + phoneNo);
		}
	};

	public Validator password = (password) -> {
		System.out.println("Enter Password : ");
		password = sc.nextLine();
		boolean isValid = validatePassRule1(password);
		if (isValid) {
			isValid = validatePassRule2(password);
			if (isValid) {
				isValid = validatePassRule3(password);
				if (isValid) {
					isValid = validatePassRule4(password);
					if (isValid) {
						return true;
					}
				}
			}
		}
		return false;
	};

	boolean validatePassRule1(String password) throws InvalidUserDetailsException {
		Pattern pattern = Pattern.compile("^.*(?=.{8,}).*$");
		Boolean isValid = pattern.matcher(password).matches();
		if (isValid) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid Password => Password must have minimum 8 characters");
		}
	}

	boolean validatePassRule2(String password) throws InvalidUserDetailsException {
		Pattern pattern = Pattern.compile("^.*(?=.*[A-Z])(?=.{8,}).*$");
		Boolean isValid = pattern.matcher(password).matches();
		if (isValid) {
			return true;
		} else {
			throw new InvalidUserDetailsException(
					"Invalid Password => password must have at least one uppercase letter");
		}
	}

	boolean validatePassRule3(String password) throws InvalidUserDetailsException {
		// At least one upperCase letter
		Pattern pattern = Pattern.compile("^.*(?=.*[A-Z])(?=.*[0-9])(?=.{8,}).*$");
		Boolean isValid = pattern.matcher(password).matches();
		if (isValid) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid Password => password must have at least numeric letter");
		}
	}

	boolean validatePassRule4(String password) throws InvalidUserDetailsException {
		// At least one upperCase letter
		Pattern pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.-_!]).*$");
		Boolean isValid = pattern.matcher(password).matches();
		if (isValid) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Invalid Password => password must have one special character");
		}
	}
}
