package Q23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode {
	
	public static int oddDigitSum(String s1[], int s) {
		
		int sum=0;
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		
		String s2[] = new String[s];
		for (int i = 0; i < s; i++) {
			s2[i] = s1[i].replaceAll("[a-zA-Z]", "");
		}
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		int s3[] = new int[s];
		for (int i = 0; i < s; i++) {
			s3[i] = Integer.parseInt(s2[i]);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < s3.length; i++) {
			al.add(s3[i]);
		} 
		
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		{
			while (itr.hasNext()) {
				int x = itr.next();
				int rem;
				while (x != 0) {
					rem = x % 10;
					if (rem % 2 != 0) {
						sum += rem;
					}
					x /= 10;
				}
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();	
		String s1[] = new String[s];
		for (int i = 0; i < s; i++) {
			s1[i] = sc.next();
		}
		int sum = UserMainCode.oddDigitSum(s1, s);
		System.out.println(sum);		
	}
}
