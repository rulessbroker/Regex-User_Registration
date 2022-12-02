package lib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bridgelabz.UserRegistration;

class UserRegistrationTest {

	static UserRegistration userRegistration;

	@BeforeAll
	public static void initialize() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.checkFirstName("Abc");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.checkLastName("Xyz");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.checkEmail("Abc.def@xyz.co.in");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.checkPhoneNo("91 9874561230");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		boolean result = userRegistration.checkPassword("A54tbh15@");
		Assertions.assertTrue(result);
	}

}
