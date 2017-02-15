package q33;

public class UserMainCode {

	public static boolean validatePassword(String s) {
	
		if (s.matches("((?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$!]).{8,})")) 
			return true;
			else
		return false;
	}

}
