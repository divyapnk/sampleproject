package Q26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			
			int res = Q26.UserMainCode.checkPalindrome(s1);
			if(res==1)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
	}

}
