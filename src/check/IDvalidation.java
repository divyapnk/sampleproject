package check;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IDvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.next();
		String res= validation(s1,s2);
		System.out.println(res);
	}
	public static String validation(String s1, String s2) {
		String res="";
		StringTokenizer st = new StringTokenizer(s1, "-");
		while (st.hasMoreElements()) {
			String id = st.nextToken();
			String loc = st.nextToken();
			String xxx = st.nextToken();
			if (id.matches("[CTS]{3}") && loc.matches(s2.substring(0, 3)) && xxx. matches("[0-9]{4}")) {
//				System.out.println("Valid");
				res="valid";
			} else {
//				System.out.println("Invalid");
				res="Invalid";
			}
		}
		return res;
	}

}
