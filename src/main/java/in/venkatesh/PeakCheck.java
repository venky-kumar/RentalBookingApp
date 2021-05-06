package in.venkatesh;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.HashMap;

public class PeakCheck {

	public static void peak(double withGst1) {
		System.out.println("-----------------------------------------");
		System.out.println("peak hour calculation and booking details");
		System.out.println("-----------------------------------------");
		String userDate = "2021-05-21";
		String UserDateMonth="2021-05";
		// Display today date

		boolean isValid = false;
		// converting the String typed date to integer
		YearMonth dateValidation = YearMonth.parse(UserDateMonth); // yyyy-mm
		if (dateValidation.isBefore(YearMonth.now())) { // logic to check date validation
			isValid = false;
			System.out.println("invalid date");
		} else {
			isValid = true;
			System.out.println("valid date");

			//LocalDate parsedate = LocalDate.parse(userDate);
			System.out.println("---------pickup date and time---------");
			String time = "17:30";
			LocalTime pickUpTime = LocalTime.parse(time);// Display today time
			int hour = pickUpTime.getHour();
			System.out.println("pickUp  date : " + userDate);
			System.out.println("PickUp Time : " + time);
			// This function is used to check the peak time
			if (hour >= 17 && hour <= 19) {
				double peakCharge1 = (withGst1 * 0.125) + withGst1;// GST calculation
				System.out.println("it is a peak hour so the price is " + peakCharge1);
			} else {
				System.out.println(" It is not a peakhour so The price for your travel is " + withGst1);
			}
		}
	}
}
