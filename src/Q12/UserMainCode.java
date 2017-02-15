package Q12;

import java.util.Scanner;

public class UserMainCode {

	public static String getSpecialChar(String s1) {
		String s2=s1.replaceAll("[a-zA-Z]", "");
		return s2;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		
		String str= UserMainCode.getSpecialChar(s1);
		System.out.println(str);
				
		sc.close();		
	}
}
