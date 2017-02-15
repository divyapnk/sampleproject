package q36;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s3 = sc.next();
		@SuppressWarnings("unused")
		int res=0;
		res=q36.UserMainCode.countWord(s1,s3);
		System.out.println(res);
		sc.close();
	}

}
