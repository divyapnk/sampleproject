  package Q35;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		int a[] = new int[s];		
		for (int i = 0; i < s; i++) {
			a[i] = sc.nextInt();
		}
		
		int res=Q35.UserMainCode.calculateMedian(a, s);
		System.out.println(res);
	}

}
