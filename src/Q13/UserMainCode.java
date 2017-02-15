package Q13;

import java.util.Scanner;

public class UserMainCode {
	
	public static int findDistance(int x1, int y1,int x2, int y2) {
		int res= (int) Math.round(Math.sqrt((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)))));
		return res;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int res = UserMainCode.findDistance(x1, y1, x2, y2);
		System.out.println(res);	
		sc.close();		

	}

}
