package in.venkatesh;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Scanner;

public class RentalBooking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginArray.arraylogin();

		LoginArray.loginValidation(9790430272l, "ragul");

		SelectionPage.displayCycleTypes();

		SelectionPage.displayBikeType();

		SelectionPage.displayCarTypes();

		MileageDetails.mileageDetails();
		
		int vehicleType = 1;
		String type = "cycle";
		int rentalHour = 8;
		double vehicleCost = 100;
		// This method is used for RentalCalculation
		RentalCalculation.calculationOfCase(vehicleType, type, rentalHour, vehicleCost);

		VehicleDetails.noPlateDetails();
		
	}

}
