package in.venkatesh;

import java.util.HashMap;
import java.util.Map;

public class VehicleMileageDetails {
	/**
	 * To display the mileage details
	 */
	static HashMap<String, Integer> mileage = new HashMap<String, Integer>();

	public static void mileageDetails() {
		mileage.put("electic cycle", 55);
		mileage.put("scooter", 40);
		mileage.put("gear bike", 50);
		mileage.put("sport bike", 30);
		mileage.put("car with A/C", 13);
		mileage.put("car without A/C", 18);
		System.out.println("------------mileage details-----------");
		System.out.println("*note mileage can be varied because of the drivers driving type");
		for (String mileage1 : mileage.keySet()) {
			Integer value = mileage.get(mileage1);
			System.out.println("The mileage for " + mileage1 + " is " + value);
		}

	}
}