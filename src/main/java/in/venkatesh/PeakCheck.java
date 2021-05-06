package in.venkatesh;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.HashMap;

public class PeakCheck {
	public static boolean isPeakTime(String rentalTime) {
		boolean valid = true;
		LocalTime pickUpTime = LocalTime.parse(rentalTime);// Display today time
		int hour = pickUpTime.getHour();
		if (hour >= 17 && hour <= 19) {
			valid = true;
		}
		else {
			valid = false;
		}
		return valid;
	}
	/**
	 * 
	 * @param rentalDate
	 * @return
	 */
	public static boolean isDateValid(String rentalDate) {
		boolean valid = true;
		YearMonth dateValidation = YearMonth.parse(rentalDate);// Display today time
	    if(dateValidation.isBefore(YearMonth.now()) ){
	    	valid = false;
	    }
	    else {
	    	valid = true;
	    }
		return valid;
	}
	/**
	 * Calculate Bill for peak hour.
	 * Add 1.25% extra charge for peak hour.
	 * @param rentalTime
	 * @param rentalDate
	 * @param withGst1
	 * @return
	 */
	public static double peakHourBillCalculation(String rentalTime,String rentalDate,double withGst1) {
		double peakCharge=0;
		boolean dateValid,timeValid;
		System.out.println("-----------------------------------------");
		System.out.println("peak hour calculation and booking details");
		System.out.println("-----------------------------------------");
		dateValid = PeakCheck.isDateValid(rentalDate);
		timeValid = PeakCheck.isPeakTime(rentalTime);
		if(dateValid && timeValid) {
			peakCharge = (withGst1 * 0.125) + withGst1;
			System.out.println("it is a peak hour so the price is " + peakCharge);
		}
		else {
			peakCharge = withGst1;
			System.out.println(" It is not a peakhour so The price for your travel is " + withGst1);
			
		}
		return peakCharge;
	}
	
}
