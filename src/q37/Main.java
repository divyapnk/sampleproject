package q37;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str=q37.UserMainCode.reverseSubstring(s1,a,b);
		System.out.println(str);
		
	}

}
