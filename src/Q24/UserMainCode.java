package Q24;

import java.util.Scanner;

public class UserMainCode {

	public static String formNewWord(String s1, int a){
		
		StringBuffer sb = new StringBuffer();
		int b = s1.length();
		int c = b - a;
		if (b > 2 * a) {
			sb.append(s1.substring(0, a)).append(s1.substring(c));
			return sb.toString();
		} 
		else {
			System.out.println("Error");
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int a = sc.nextInt();
		
		String str = UserMainCode.formNewWord(s1, a);
		System.out.println(str);
	}

}
