package check;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
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
		System.out.println(sb);
		


	}

}
