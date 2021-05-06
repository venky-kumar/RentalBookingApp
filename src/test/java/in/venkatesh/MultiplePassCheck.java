package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplePassCheck {

	@Test
	public void test1() {

		String check1 = "Venkatesh@kumar20";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check1);
		assertTrue(isValidPassword);
	}

	@Test
	public void test2() {
		String check2 = "venkatesh@kumar20";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check2);
		assertFalse(isValidPassword);
	}

	@Test
	public void test3() {

		String check3 = "Venkatesh@kumar";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check3);
		assertFalse(isValidPassword);
	}

	@Test
	public void test4() {
		String check4 = "Venkateshkumar20";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check4);
		assertFalse(isValidPassword);
	}

	@Test
	public void test5() {
		String check5 = "Vk";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check5);
		assertFalse(isValidPassword);
	}

	@Test
	public void test6() {
		String check6 = "60";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check6);
		assertFalse(isValidPassword);
	}

	@Test
	public void test7() {
		String check7 = "";
		boolean isValidPassword = MultiplePasswordCheck.isValidPassword(check7);
		assertFalse(isValidPassword);

	}

}
