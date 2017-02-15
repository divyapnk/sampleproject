package check;

import java.util.Scanner;

public class q105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int a=sc.nextInt();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < a; i++) {
			if(s.length()>=3)
				sb.append(s.substring(0,3));
			else
				sb.append(s.substring(0,s.length()));
		}
		System.out.println(sb.toString());		
	}

}
