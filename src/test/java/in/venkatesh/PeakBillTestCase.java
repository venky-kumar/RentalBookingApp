package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeakBillTestCase {

	/**
	 * Test with peak hour 
	 */
	@Test
	public void PeakTimeTest1() {
		String time = "17:30";
		boolean valid = PeakHourCheck.isPeakTime(time);
		assertTrue(valid);
	}
	
	/**
	 * Test with non peak hour(12am)
	 */
	@Test
	public void PeakTimeTest2() {
		String time = "00:00";
		boolean valid = PeakHourCheck.isPeakTime(time);
		assertFalse(valid);
	}
	/**
	 * Test with non peak hour
	 */
	@Test
	public void PeakTimeTest3() {
		String time = "11:30";
		boolean valid = PeakHourCheck.isPeakTime(time);
		assertFalse(valid);
	}
	
	@Test
	public void PeakTimeTest4() {
		String time = null;
		boolean valid = PeakHourCheck.isPeakTime(time);
		assertFalse(valid);
	}
	/**
	 * Test the correct date
	 */
	@Test
	public void dateCheck1() {
		String date = "2021-05-08";
		boolean valid = PeakHourCheck.isDateValid(date);
		assertTrue(valid);
	}
	/**
	 * Test with past date
	 */
	@Test
	public void dateCheck2() {
		String date = null;
		boolean valid = PeakHourCheck.isDateValid(date);
		assertFalse(valid);
	}
	/**
	 * Bill calculation with correct date and peak hour
	 */
	
	
	/**
	 * Bill calculation with before date and non peak hour
	 */
	@Test
	public void PeakCalculationTest1() { //Both the time and date are valid
		String time = "17:30";
		String rentalDate = "2021-05-08";
		double withGst1 = 30;
		double result = PeakHourCheck.peakHourBillCalculation(time,rentalDate,withGst1);
		System.out.println("The test1 "+result);
		assertEquals(result,33.75,0.001);
		
	}
	
	@Test
	public void PeakCalculationTest2() { //Both are invalid
		String time = "00:00";
		String rentalDate = "2021-03-08";
		double withGst1 = 30;
		double result = PeakHourCheck.peakHourBillCalculation(time,rentalDate,withGst1);
		System.out.println("The test2 "+result);
		assertEquals(result,0.00,0.001);
		
	}
	@Test
	public void PeakCalculationTest3() { //Time is peak and date is valid
		String time = "17:30";
		String rentalDate = "2021-05-09";
		double withGst1 = 30;
		double result = PeakHourCheck.peakHourBillCalculation(time,rentalDate,withGst1);
		System.out.println("The test3 "+result);
		assertEquals(result,33.75,0.001);
		
	}
	@Test
	public void PeakCalculationTest4() { //Time is not peak and date is valid
		String time = "16:30";
		String rentalDate = "2021-05-09";
		double withGst1 = 30;
		double result = PeakHourCheck.peakHourBillCalculation(time,rentalDate,withGst1);
		System.out.println("The test3 "+result);
		assertEquals(result,30.0,0.001);
		
	}
	

}
