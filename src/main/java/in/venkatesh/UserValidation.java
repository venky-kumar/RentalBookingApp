package in.venkatesh;

import java.util.ArrayList;

public class UserValidation {
	/**
	 * This method store the user details
	 */
	public static void addUser() {
		ArrayList<Detail> userDetail = new ArrayList<Detail>();
		Detail user1 = new Detail();
		user1.userMobileNo = 9790430272L;
		user1.password = "ragul";

		Detail user2 = new Detail();
		user2.userMobileNo = 9600900509L;
		user2.password = "gunal";
		userDetail.add(user1);
		userDetail.add(user2);

		for (Detail user : userDetail) {
			System.out.println(user.userMobileNo + "-" + user.password);
		}

	}

	/**
	 * This method validates the mobile number and password
	 */
	public static boolean loginValidation(Long mobNo, String password) {
		boolean result;
		if (MobileNumberValidation(mobNo) == true && password == "ragul") {
			result = true;
			System.out.println("logged in successfully");
		} else {
			result = false;
		}

		return result;
	}

	/**
	 * This method is used for validating mobile number
	 * 
	 * @param mobNo
	 * @return
	 */
	public static boolean MobileNumberValidation(Long mobNo) {
		String mobileNo = String.valueOf(mobNo);
		boolean isValid = false;
		if (mobNo != 0 && mobileNo.length() == 10) {
			isValid = true;
		}
		return isValid;
	}
}
