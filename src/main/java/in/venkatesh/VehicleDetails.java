/**
 * 
 */
package in.venkatesh;

import java.util.HashMap;
import java.util.Set;

/**This method used to display the NumberPlates details
 * @author venk2622
 *
 */
public class VehicleDetails {
	public static void noPlateDetails() {
		HashMap<Integer, String> noPlateDetails = new HashMap<Integer, String>();
		System.out.println("--------------------");
		System.out.println("    vehicle info    ");
		System.out.println("--------------------");

		noPlateDetails.put(1, "TN 59 5760");
		noPlateDetails.put(2, "TN 58 9870");
		noPlateDetails.put(3, "TN 64 8854");
		noPlateDetails.put(4, "TN 60 7896");

		System.out.println("the no plate details of the  vehicles are :");
		Set<Integer> keySet = noPlateDetails.keySet();
       
		for (Integer key : keySet) {

			String value = noPlateDetails.get(key);
			System.out.println(key + ":" + value);
		}

		String string = noPlateDetails.get(1);
		System.out.println("your booked vehicle no is:" + string);

	}

}
