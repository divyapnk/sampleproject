package q37;

public class UserMainCode {

	public static String reverseSubstring(String s1, int a, int b) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
//		StringBuffer sb1 = new StringBuffer();
//		String ss = sb1.append(sb.substring(a, a + b)).toString();
		
		String ss = sb.substring(a, a + b).toString();

		return ss;
	}

}
