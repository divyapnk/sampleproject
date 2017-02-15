package check;

import java.util.Scanner;

public class stringRepetition {

	/*public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int s = sc.nextInt();
		String res= getResult(a,s);
		
			System.out.print(res);
		
	}
	
	public static String getResult(String a, int s) {
		String b = "";
		StringBuffer sb = new StringBuffer(a);
		if (s >= 3) {
			b = sb.substring(0, 3);
		} 
		else if (s <= 2) {
			b = sb.substring(0, s);
		}
		
			String res="";	
		for (int i = 0; i < s; i++) {
			res= sb.append(b).append(" ").toString();
		}
		return res;
	}
}  */

public static String lengthiestString(String s1,int n){
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<n;i++) {
	if(n>=3)	
		sb.append(s1.substring(0,3)).append(" ");
	else if(n==2)
		sb.append(s1.substring(0,2)).append(" ");
	else if(n==1)
		sb.append(s1.substring(0,1));
    	}
    return sb.toString();
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the String:");
	String s1=s.nextLine();
	int n=s.nextInt();
	System.out.println("the lengthiest string is:"+lengthiestString(s1,n));
	}
}


