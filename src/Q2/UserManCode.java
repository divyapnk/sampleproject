package Q2;

import java.util.Scanner;

public class UserManCode {
	public static int getSum(int a,int b,int c) {
		int sum=0;
		if(a==13)
			sum=c;
		else if(b==13)
			sum=a;
		else if(c==13)
			sum=a+b;
		else 
			sum=a+b+c;
		return sum;		
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UserManCode us=new UserManCode();
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		System.out.println(UserManCode.getSum(a, b, c));		
	}
}  
