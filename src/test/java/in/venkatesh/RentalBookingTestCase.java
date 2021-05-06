package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class RentalBookingTestCase {

	@Test
	public void testCase1() {
		long mobno = 9790430272l;
		String password = "ragul";
		boolean isValid=LoginArray.loginValidation(mobno, password);
		assertTrue(isValid);
	}
	
	@Test
	public void testCase2() {
		long mobno = 9790430272l;
		String password = "gunal";
		boolean isValid=LoginArray.loginValidation(mobno, password);
		assertFalse(isValid);
	}
	@Test
	public void testCase3() {
		long mobno = 9790430l;
		String password = "ragul";
		boolean isValid=LoginArray.loginValidation(mobno, password);
		assertFalse(isValid);
	}
	@Test
	public void testCase4() {
		long mobno =0;
		String password = "ragul";
		boolean isValid=LoginArray.loginValidation(mobno, password);
		assertFalse(isValid);
	}
}

