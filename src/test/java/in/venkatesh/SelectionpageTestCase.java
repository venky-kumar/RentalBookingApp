package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionpageTestCase {
	// add cycleType
	@Test
	public void test1() {
		SelectionPage.displayCycleTypes();
	}

	// del cycle type status
	@Test
	public void test2() {
		SelectionPage.delCycleType("cycle");
		boolean actual = SelectionPage.deleteStatus("cycle");
		assertTrue(actual);
	}

	// add cycle status
	@Test
	public void test3() {
		SelectionPage.addCycleType("Mountain Drive", 200);
		boolean actual = SelectionPage.addCycleStatus("Mountain Drive");
		assertTrue(actual);
	}

	@Test
	public void test4() {
		System.out.println();
		SelectionPage.displayBikeType();

	}

	@Test
	public void test5() {
		SelectionPage.delBikeType("bike");
		boolean actual = SelectionPage.deletebikeStatus("bike");
		assertTrue(actual);
	}

	// add bike status
	@Test
	public void test6() {
		SelectionPage.addBikeType("super bike", 450);
		boolean actual = SelectionPage.addBikeStatus("super bike");
		assertTrue(actual);
		SelectionPage.displayBikeType();

	}

	@Test
	public void test7() {
		System.out.println();
		SelectionPage.displayCarTypes();

	}

	@Test
	public void test8() {
		SelectionPage.deleteCarStatus("car");
		boolean actual = SelectionPage.deleteCarStatus("car");
		assertTrue(actual);
	}

	// add car status
	@Test
	public void test9() {
		SelectionPage.addCarType("sport car", 1500);
		boolean actual = SelectionPage.addCarStatus("sport car");
		assertFalse(actual);
	}
}
