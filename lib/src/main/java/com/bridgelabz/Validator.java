package com.bridgelabz;

public interface Validator {
	boolean validate(String data) throws InvalidUserDetailsException;
}
