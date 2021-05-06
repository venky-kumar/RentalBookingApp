package in.venkatesh;

import java.util.ArrayList;

public class LoginArray {
	public static void arraylogin() {
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
	public static boolean loginValidation(Long mobNo, String password) {
		boolean result;
		if (mobilenoValidation(mobNo)==true && password == "ragul") {
			result = true;
			System.out.println("logged in successfully");
		} else {
			result = false;
		}

		return result;
	}

	public static boolean mobilenoValidation(Long mobNo)
	{
		String mobileNo=String.valueOf(mobNo);
		boolean isValid=false;
		if(mobNo !=0 && mobileNo.length()==10)
		{
			isValid=true;
		}
		return isValid;
	}
}
