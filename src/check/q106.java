package check;

import java.util.Scanner;

public class q106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		boolean b=false;
		if(s.matches("[0]{2}[0-9]{8}"))
			b=false;
		else if(s.matches("[0-9]{10}"))
//			System.out.println("T");
			b=true;
		System.out.println(b);
	}

}
