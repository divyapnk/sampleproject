package Q11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMainCode {
	
	public static String[] convertToStringArray(ArrayList<String> a) {
		Collections.sort(a);
		String s[]=new String[a.size()];
		a.toArray(s);
		return s;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<n;i++){
			a.add(sc.next());
		}
				
		String s[]=UserMainCode.convertToStringArray(a);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);

		sc.close();

	}

}
