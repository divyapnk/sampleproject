package q80;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a[] = new int[s];
		for (int i = 0; i < s; i++)
		a[i] = sc.nextInt();
		
		System.out.println(q80.UserMainCode.getBoundaryAverage(a));
	}
}
