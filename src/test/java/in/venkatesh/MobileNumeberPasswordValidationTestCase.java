package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class MobileNumeberPasswordValidationTestCase {
	/**
	 * checking with correct mobile number and password
	 */
	@Test
	public void testCase1() {
		long mobno = 9790430272l;
		String password = "ragul";
		boolean isValid=UserValidation.loginValidation(mobno, password);
		assertTrue(isValid);
	}
	/**
	 * checking with correct mobile number and wrong password 
	 */
	
	@Test
	public void testCase2() {
		long mobno = 9790430272l;
		String password = "gunal";
		boolean isValid=UserValidation.loginValidation(mobno, password);
		assertFalse(isValid);
	}
	/**
	 * checking with invalid mobile number 
	 */
	@Test
	public void testCase3() {
		long mobno = 9790430l;
		String password = "ragul";
		boolean isValid=UserValidation.loginValidation(mobno, password);
		assertFalse(isValid);
	}
	/**
	 * checking with null mobile number 
	 */
	@Test
	public void testCase4() {
		long mobno =0;
		String password = "ragul";
		boolean isValid=UserValidation.loginValidation(mobno, password);
		assertFalse(isValid);
	}
}

