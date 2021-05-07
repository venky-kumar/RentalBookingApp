package in.venkatesh;

public class VehicleCostCalculation {

	/**
	 * Cost Estimation
	 * @param vehicleType
	 * @param type
	 * @param rentalHour
	 * @param vehicleCost
	 */
	public static void calculationOfCase(int vehicleType, String type, int rentalHour, double vehicleCost) {
		String time = "17:30";
		String rentalDate = "2021-05-08";
		System.out.println("---------------------");
		System.out.println("   COST ESTIMATION   ");
		System.out.println("---------------------");
		System.out.println("you have selected " + type);
		double withGst1;
		if(rentalHour>0 && PeakHourCheck.isDateValid(rentalDate) && PeakHourCheck.isPeakTime(time)) {
			double calculate = vehicleCost * rentalHour;
			System.out.println("the cost for  " + type + " is =" + calculate);
			double gst1 = (calculate * 8 / 100);
			withGst1 = (calculate + gst1);
			System.out.println("the cost for " + type + " with gst is =" + withGst1);
		}
		else {
			System.out.println("Invalid Date and Time");
			withGst1 = 0;
		}
		
		
		
		PeakHourCheck.peakHourBillCalculation(time,rentalDate, withGst1);
	     

	}

}
