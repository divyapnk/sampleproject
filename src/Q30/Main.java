package Q30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String str=Q30.UserMainCode.removeEvenVowels(s1);
		System.out.println(str);
		sc.close();

	}

}
