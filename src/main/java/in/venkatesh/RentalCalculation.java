package in.venkatesh;

public class RentalCalculation {

	/**
	 * Cost Estimation
	 * @param vehicleType
	 * @param type
	 * @param rentalHour
	 * @param vehicleCost
	 */
	public static void calculationOfCase(int vehicleType, String type, int rentalHour, double vehicleCost) {
		System.out.println("---------------------");
		System.out.println("   COST ESTIMATION   ");
		System.out.println("---------------------");
		System.out.println("you have selected " + type);
		double withGst1;
		if(rentalHour>0) {
			double calculate = vehicleCost * rentalHour;
			System.out.println("the cost for  " + type + " is =" + calculate);
			double gst1 = (calculate * 8 / 100);
			withGst1 = (calculate + gst1);
		}
		else {
			withGst1 = 0;
		}
		
		System.out.println("the cost for " + type + " with gst is =" + withGst1);
		String time = "17:30";
		String rentalDate = "2021-05";
		PeakCheck.peakHourBillCalculation(time,rentalDate, withGst1);
	     

	}

}
