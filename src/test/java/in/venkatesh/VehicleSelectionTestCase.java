package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleSelectionTestCase {
	// add cycleType
	@Test
	public void test1() {
		VehicleSelection.displayCycleTypes();
	}

	/**
	 * delete cycle type status checking
	 */
	@Test
	public void test2() {
		VehicleSelection.delCycleType("cycle");
		boolean actual = VehicleSelection.deleteStatus("cycle");
		assertTrue(actual);
	}

	/**
	 * add cycle status
	 */
	@Test
	public void test3() {
		VehicleSelection.addCycleType("Mountain Drive", 200);
		boolean actual = VehicleSelection.addCycleStatus("Mountain Drive");
		assertTrue(actual);
	}

	/**
	 * Display vehicle 
	 */
	@Test
	public void test4() {
		System.out.println();
		VehicleSelection.displayBikeType();

	}
	/**
	 * check the deleted bike status 
	 */
	@Test
	public void test5() {
		VehicleSelection.delBikeType("bike");
		boolean actual = VehicleSelection.deletebikeStatus("bike");
		assertTrue(actual);
	}

	/**
	 *  check the added  bike status
	 */
	@Test
	public void test6() {
		VehicleSelection.addBikeType("super bike", 450);
		boolean actual = VehicleSelection.addBikeStatus("super bike");
		assertTrue(actual);
		VehicleSelection.displayBikeType();

	}
	/**
	 * Display car types
	 */
	@Test
	public void test7() {
		System.out.println();
		VehicleSelection.displayCarTypes();

	}
	/**
	 * check the deleted car status 
	 */

	@Test
	public void test8() {
		VehicleSelection.deleteCarStatus("car");
		boolean actual = VehicleSelection.deleteCarStatus("car");
		assertTrue(actual);
	}

	/**
	 * check the  added car status
	 */
	@Test
	public void test9() {
		VehicleSelection.addCarType("sport car", 1500);
		boolean actual = VehicleSelection.addCarStatus("sport car");
		assertFalse(actual);
	}
}
