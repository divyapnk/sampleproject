package Q3;

import java.util.Scanner;

public class UserMainCode {
	
	public static String getString(String s) {
		
		StringBuffer sb =new StringBuffer();
		if(s.charAt(0)=='j')  {
			if(s.charAt(1)=='b')  {
			sb.append(s);
			}
			else {
				sb.append(s.charAt(0)).append(s.substring(2));
			}
		}
		else if(s.charAt(1)=='b') {
			sb.append(s.charAt(0)).append(s.substring(2));
		}
		else {
			sb.append(s.substring(2));
		}		
		return sb.toString();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(UserMainCode.getString(s));		

	}

}
