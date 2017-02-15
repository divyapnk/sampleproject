package Q22;

import java.util.Scanner;

public class UserMainCode {
	public static String getCombo(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb1 = new StringBuffer(s2);
		if (len1 > len2) {
			sb.append(s2).append(s1);
			return sb.toString();		
		} 
		else {
			sb1.append(s1).append(s2);
			return sb1.toString();
		}				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		String str= UserMainCode.getCombo(s1, s2);
		System.out.println(str);
	}
}
