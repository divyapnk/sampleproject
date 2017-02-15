package finalpre;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(checkForFirstAndLastChar(input));
	}
	public static int checkForFirstAndLastChar(String input) 
	{
		StringTokenizer t = new StringTokenizer(input," ");
		String s = t.nextToken();
		String s1 = " "; 
		while(t.hasMoreTokens())
		{
			s1 = t.nextToken();
		}
		if(s.charAt(0) == s1.charAt(s1.length()-1))
			return 1;
		else 
			return 0; 
	}

}
