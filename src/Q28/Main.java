package Q28;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws ParseException  {
		// TODO Auto-generated method stub
//		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean b=Q28.UserMainCode.isLeapYear(s);
		if(b==true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
