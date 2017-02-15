package Q19;

import java.util.Scanner;

public class UserMainCode {

	public static int
	countWord(String[] s,int a) {
		int count=0;
		for(int i=0;i<s.length;i++){
			if(s[i].length()==a){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		int a=sc.nextInt();
		System.out.println(UserMainCode.countWord(s, a));
		sc.close();
	}

}
