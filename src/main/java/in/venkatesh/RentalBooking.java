package in.venkatesh;


public class RentalBooking {
	public static void main(String[] args) {

		UserValidation.addUser();

		UserValidation.loginValidation(9790430272l, "ragul");

		VehicleSelection.displayCycleTypes();

		VehicleSelection.displayBikeType();

		VehicleSelection.displayCarTypes();

		VehicleMileageDetails.mileageDetails();
	    
		
		int vehicleType = 1;
		String type = "cycle";
		int rentalHour = 8;
		double vehicleCost = 100;
		/**
		 *  This method is used for RentalCalculation
		 */
		VehicleCostCalculation.calculationOfCase(vehicleType, type, rentalHour, vehicleCost);

		VehicleDetails.vehicleNumberPlateDetail();
		
	}

}
