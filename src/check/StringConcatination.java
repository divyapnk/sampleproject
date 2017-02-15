package check;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		getvalues(s1,s2);
	}
	public static void getvalues(String s1, String s2) {
	StringBuffer sb=new StringBuffer();
	int l1=s1.length();
	int l2=s2.length();
	if(l1==l2) {
		sb.append(s1).append(s2);
	}
	else if(l1>l2){
		sb.append(s1.substring(s1.length()-s2.length(),s1.length())).append(s2);
	}
	else if(l1<l2)	{
		sb.append(s1).append(s2.substring(s2.length()-s1.length(),s2.length()));
	}
	System.out.println(sb);
	}


}
