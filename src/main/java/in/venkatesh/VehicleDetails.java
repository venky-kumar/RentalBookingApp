/**
 * 
 */
package in.venkatesh;

import java.util.HashMap;
import java.util.Set;

public class VehicleDetails {

	/**
	 * This method used to display the NumberPlate details
	 *
	 */
	public static void vehicleNumberPlateDetail() {
		HashMap<Integer, String> NumberPlateDetails = new HashMap<Integer, String>();
		System.out.println("--------------------");
		System.out.println("    vehicle info    ");
		System.out.println("--------------------");

		NumberPlateDetails.put(1, "TN 59 5760");
		NumberPlateDetails.put(2, "TN 58 9870");
		NumberPlateDetails.put(3, "TN 64 8854");
		NumberPlateDetails.put(4, "TN 60 7896");

		System.out.println("the no plate details of the  vehicles are :");
		Set<Integer> keySet = NumberPlateDetails.keySet();

		for (Integer key : keySet) {
			String value = NumberPlateDetails.get(key);
			System.out.println(key + ":" + value);
		}

		String string = NumberPlateDetails.get(1);
		System.out.println("your booked vehicle no is:" + string);

	}

}
