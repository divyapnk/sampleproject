package check;

import java.util.Scanner;

public class q110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1 = sb.toString();
		if (s.charAt(0) == s1.charAt(0)) {
		System.out.println("valid");
		} else {
		System.out.println("invalid");
		}
	}

}
