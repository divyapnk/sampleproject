package Q7;

import java.util.Scanner;

public class UserMainCode {
	
	public static boolean isEqual(String s1, String s2, int n) {
		
		StringBuffer sb2=new StringBuffer(s2);
		sb2.reverse();
		s2=sb2.toString();		
		s1=String.valueOf(s1.charAt(n-1));
		s2=String.valueOf(s2.charAt(n-1));
		
		if(s1.equalsIgnoreCase(s2)) {
			return true;
		}
		else {		
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n=sc.nextInt();
				
		System.out.println(UserMainCode.isEqual(s1, s2, n));
		
		sc.close();


	}

}
