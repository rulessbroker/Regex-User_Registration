package lib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.bridgelabz.InvalidUserDetailsException;
import com.bridgelabz.UserRegistration;

class UserRegistrationTest {

	static UserRegistration userRegistration;

	@BeforeAll
	public static void initialize() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.checkFirstName("Abc");
		Assertions.assertTrue(result);
	}
	

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.checkLastName("Xyz");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.checkEmail("abc.def@xyz.co.in");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.checkPhoneNo("91 9874561230");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() throws InvalidUserDetailsException {
		boolean result = userRegistration.checkPassword("A54tbh15@");
		Assertions.assertTrue(result);
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" })
	public void givenEmail_WhenValid_ShouldReturnTrue(boolean email) {
		Assertions.assertTrue(email);
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
			"abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
			"abc@gmail.com.1a", "abc@gmail.com.aa.au" })
	public void givenEmail_WhenInValid_ShouldReturnFalse(boolean email) {
		Assertions.assertFalse(email);
	}
}
