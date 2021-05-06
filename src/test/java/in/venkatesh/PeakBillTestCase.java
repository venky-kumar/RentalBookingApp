package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeakBillTestCase {

	@Test
	public void PeakTimeTest1() {
		String time = "17:30";
		boolean valid = PeakCheck.isPeakTime(time);
		assertTrue(valid);
	}
	
	@Test
	public void PeakTimeTest2() {
		String time = "00:00";
		boolean valid = PeakCheck.isPeakTime(time);
		assertFalse(valid);
	}
	@Test
	public void dateCheck1() {
		String date = "2021-05";
		boolean valid = PeakCheck.isDateValid(date);
		assertTrue(valid);
	}
	@Test
	public void dateCheck2() {
		String date = "2021-03";
		boolean valid = PeakCheck.isDateValid(date);
		assertFalse(valid);
	}
	@Test
	public void PeakTimeTest3() {
		String time = "11:30";
		boolean valid = PeakCheck.isPeakTime(time);
		assertFalse(valid);
	}
	@Test
	public void PeakCalculationTest1() {
		String time = "17:30";
		String rentalDate = "2021-05";
		double withGst1 = 30;
		double result = PeakCheck.peakHourBillCalculation(time,rentalDate,withGst1);
		assertEquals(result,33.75,0.001);
		
	}
	@Test
	public void PeakCalculationTest2() {
		String time = "00:00";
		String rentalDate = "2021-03";
		double withGst1 = 30;
		double result = PeakCheck.peakHourBillCalculation(time,rentalDate,withGst1);
		assertEquals(result,30,0.001);
		
	}
	

}
