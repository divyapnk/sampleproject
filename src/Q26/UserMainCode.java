package Q26;

public class UserMainCode {

	public static int checkPalindrome(String s1) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer(s1);
		String s2 = sb.reverse().toString();
		
		if (s1.equals(s2)) 
			return 1;		
		else 
			return -1;
	}	 
}
