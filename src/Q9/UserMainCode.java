package Q9;

import java.util.Scanner;

public class UserMainCode {
	public static int addOddNumbers(int s) {
		int sum = 0;
		for (int i = 1; i <= s; i++) {
		if (i % 2 != 0) {
		sum += i;
		}
		}
		return sum;
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(UserMainCode.addOddNumbers(s));		
		sc.close();
	}

}
