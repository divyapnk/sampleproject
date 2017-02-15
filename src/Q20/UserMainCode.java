package Q20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UserMainCode {
	public static int ipValidator(String s1) {
		int flag = 0;
//		int res=2;
		StringTokenizer st = new StringTokenizer(s1, ".");
		while (st.hasMoreTokens()) {
			String s2 = st.nextToken();
			int n = Integer.parseInt(s2);
			if (n > 0 && n <= 255) {
				flag++;
			}
		}
		if (flag == 4) {
//			res=1;
			return 1;
		} 
		else {
//			res=2;
			return 2;			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int res= UserMainCode.ipValidator(s1);
		if(res==1)
			System.out.println("valid");
		else
			System.out.println("Invalid");
		sc.close();
	}

}
