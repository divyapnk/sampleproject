package Q6;

import java.util.Scanner;

public class UserMainCode {

	public static int addAndReverse(int a[],int num)  {
		int sum=0,rev=0;
		for(int i=a.length-1;i>0;i--) {
			if(a[i]==num)
				break;
			else
				sum=sum+a[i];
		}
		while(sum!=0){
			int rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;			
		}				
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		
		int a[]=new int[s];
		for (int i = 0; i < s; i++) {
			a[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		
		
		int res=UserMainCode.addAndReverse(a,num);
		System.out.println(res);
		sc.close();

	}

}
