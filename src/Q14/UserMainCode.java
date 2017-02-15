package Q14;

import java.util.Scanner;

public class UserMainCode {

	public static int commonChars(String s1, String s2){
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);
		for(int i=0;i<sb1.length();i++){
			int c=0;
			for(int j=i+1;j<sb1.length();j++){
				if(sb1.charAt(i)==sb1.charAt(j)){
					sb1.deleteCharAt(j);
					c++;
				}
			}
			if(c>=1){
				sb1.deleteCharAt(i);
			}
		}
		for(int i=0;i<sb2.length();i++){
			int c=0;
			for(int j=i+1;j<sb2.length();j++){
				if(sb2.charAt(i)==sb2.charAt(j)){
					sb2.deleteCharAt(j);
					c++;
				}
			}
			if(c>=1){
				sb2.deleteCharAt(i);
			}
		}
		int count=0;
		for(int i=0;i<sb1.length();i++){
			for(int j=0;j<sb2.length();j++){
				if(sb1.charAt(i)==sb2.charAt(j)){
					count++;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int count= UserMainCode.commonChars(s1, s2);
		System.out.println(count);
		sc.close();

	}

}
