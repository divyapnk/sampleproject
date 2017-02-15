package Q15;

import java.util.Scanner;

public class UserMainCode {
	public static String concatCharacter(String s[], int n){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++){
			int l=s[i].length()-1;						
			sb.append(s[i].charAt(l));						
		}
		return sb.toString();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		
		String str=UserMainCode.concatCharacter(s, n);
		System.out.println(str);
		sc.close();		
	}

}
