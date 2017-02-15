package q36;

import java.util.StringTokenizer;

public class UserMainCode {

	public static int countWord(String s1, String s3) {
		// TODO Auto-generated method stub
		int count=0;
		StringTokenizer st = new StringTokenizer(s1, " ");
		while (st.hasMoreElements()) {
		String s2 = st.nextToken();
		if (s2.equals(s3)) {
		count++;

		}
		
		}
		return count;
		}
	}
