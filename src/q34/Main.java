package q34;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int res=UserMainCode.compareLastWords(s1);
		System.out.println(res);
		sc.close();


	}

}
