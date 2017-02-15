package check;

import java.util.Scanner;

public class q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		if (s1.matches("[CPT-]{4}[0-9]{6}")) {
			System.out.println("True");
		} 
		else {
		System.out.println("False");
		}		
	}

}
