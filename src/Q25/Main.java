package Q25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		long res = Q25.UserMainCode.convertDecimalToBinary(n);
		System.out.println(res);
	}
}
