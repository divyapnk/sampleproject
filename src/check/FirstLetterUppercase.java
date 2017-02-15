package check;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FirstLetterUppercase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s1, " ");
		while (st.hasMoreElements()) {
			String s2 = st.nextToken();
			s2 = sb.append(s2.substring(0, 1).toUpperCase()).append(s2.substring(1)).append(" ").toString();
//			sb.append(s2); 
		}
		System.out.println(sb.toString());
		}	

	
}
