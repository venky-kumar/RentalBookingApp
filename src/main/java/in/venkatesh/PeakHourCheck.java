package in.venkatesh;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.HashMap;

public class PeakHourCheck {
	/**
	 * This method is used to check the given time is peak hour
	 * @param rentalTime
	 * @return
	 */
	public static boolean isPeakTime(String rentalTime) {
		boolean valid = false;
		if(rentalTime != null) {
			LocalTime pickUpTime = LocalTime.parse(rentalTime);// Display today time
			int hour = pickUpTime.getHour();
			if (hour >= 17 && hour <= 19) {
				valid = true;
			}
		}
		
		return valid;
	}
	/**
	 *This method is used to check the given date is valid or not 
	 * @param rentalDate
	 * @return
	 */
	public static boolean isDateValid(String rentalDate) {
		boolean valid = false;
		if(rentalDate != null) {
			LocalDate dateValidation = LocalDate.parse(rentalDate);// Display today time
			if(dateValidation.isAfter(LocalDate.now()) ){
				valid = true;
	    }
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
		double peakCharge=0.00;
		boolean dateValid,timeValid;
		if(rentalTime != null || rentalDate != null ) {
			System.out.println("-----------------------------------------");
			System.out.println("peak hour calculation and booking details");
			System.out.println("-----------------------------------------");
			dateValid = PeakHourCheck.isDateValid(rentalDate);
			timeValid = PeakHourCheck.isPeakTime(rentalTime);
			
			if(dateValid) {
				if(timeValid) {
					peakCharge = (withGst1 * 0.125) + withGst1;
					System.out.println("it is a peak hour so the price is " + peakCharge);
				}
				else {
					System.out.println("Not a peak time");
					peakCharge = withGst1;
				}
				}
			else {
				System.out.println("Invalid date");
		}
		}
		return peakCharge;
	}
	
}
