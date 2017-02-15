package Q18;

import java.util.Scanner;

public class UserMainCode {
	public static int sumOfDigits(String s1){
		int sum=0;
		StringBuffer sb = new StringBuffer();
		String s2 = s1.replaceAll("[a-zA-Z]", "");
		if (s2.isEmpty()) {
			sum=-1;
			return sum;
		} 
		else {
			int a = Integer.parseInt(s2);
			while (a != 0) {
				int rem;
				rem = a % 10;
				sum += rem;
				a /= 10;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		String s1 = sc.next();
		int sum=UserMainCode.sumOfDigits(s1);
		System.out.println(sum);
		sc.close();
	}
}
