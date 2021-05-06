package in.venkatesh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiplePasswordCheck {
	/**
	 * Password validation
	 * @param password
	 * @return
	 */
	 public static boolean isValidPassword(String password)
	    {
	  
	        
	        String checks = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$";
	        Pattern p = Pattern.compile(checks);
	        if (password == null) {
	            return false;
	        }
	        Matcher m = p.matcher(password);
	        return m.matches();
	    }
	  
}

