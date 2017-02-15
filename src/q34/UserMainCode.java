package q34;

import java.util.StringTokenizer;

public class UserMainCode {

	public static int compareLastWords(String s1){
		
		int res=0;
		StringTokenizer st = new StringTokenizer(s1, " ");
		String s2 = st.nextToken();
		
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s3 = sb.toString();
		
		StringTokenizer st11 = new StringTokenizer(s3, " ");
		String x = st11.nextToken();
		StringBuffer sb1 = new StringBuffer(x);
		sb1.reverse();
		String s4 = sb1.toString();
		
		if (s2.equalsIgnoreCase(s4))
			res=s2.length();
		else
			res=s2.length()+x.length();
		return res;
	}
}
