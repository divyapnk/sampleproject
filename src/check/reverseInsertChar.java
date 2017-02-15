package check;

import java.util.Scanner;

public class reverseInsertChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s=new Scanner(System.in);
			System.out.println("enter the String:");
			String s1=s.next();
			System.out.println("Enter the character:");
			char c=s.next().charAt(0);
			System.out.println("the formatted string is: "+reversedAndParsedString(s1,c));			
		}
	public static String reversedAndParsedString(String s1,char c){
			String str="";
			StringBuffer sb=new StringBuffer(s1);
//			StringBuffer sb1=new StringBuffer(s1);
			sb.reverse();
			for(int i=0;i<(2*s1.length())-1;i++) {
				if(i%2!=0)
					str = sb.insert(i,c).toString();
			}
			return str;
//					sb1.toString();
	}			
}	