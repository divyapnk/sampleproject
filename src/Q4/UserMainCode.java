package Q4;

import java.util.Scanner;

public class UserMainCode {
	public static int validateColorCode(String color) {
		int res=-1;
		if(color.matches("[#]{1}[A-F0-9]{6}")) {
			res=1;
			return res;
		}
		else  {
			res=-1;
			return res;
		}					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		
		int res= UserMainCode.validateColorCode(color);
		if(res==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}
