package q96;

public class UserMainCode {

	public static String encrypt(String s1) {
		String s2 = "abcdefghijklmnopqrstuvwxyza";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 != 0) {
				sb.append(s1.charAt(i));
			}
			else {
				int n = s2.indexOf(s1.charAt(i));
				sb.append(s2.charAt(n + 1));
			}
		}
		return sb.toString();
	}

}
