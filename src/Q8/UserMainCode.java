package Q8;

import java.util.Scanner;
//import java.text.ParseException;

public class UserMainCode {
	
	public static int getNumberOfDays(int year, int month) {
		int days = 0;
		if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
			days = 31;
		} 
		else if (month == 3 || month == 5 || month == 8 || month == 10) {
			days = 30;
		}
		 else if (month == 1) {
			 UserMainCode gc = new UserMainCode();
			 boolean b = gc.isLeapYear(year);
			 if (b == true) {
				 days = 29;
			 }
			 else {
				 days = 28;
			 }
		}
		return days;
	}

	private boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if(year%4==0){
			if(year%400==0) {
				return true;				
			}
			else if(year%100==0)
				return false;
			else
				return true;			
		}
		else
			return false;
	}

	public static void main(String[] args) {
		//	throws ParseException  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		int res= UserMainCode.getNumberOfDays(year,month);
		System.out.println(res);
		sc.close();
	}
}
