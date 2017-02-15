package Q5;

import java.util.Scanner;

public class UserMainCode {
	
	public static int getDigitSum(int num)  {
		int rem,sum=0;
		while(num!=0)  {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		if(sum<9) {
			return sum;
		}
		else {
			int sum1=0;
			while(sum!=0) {
				rem=sum%10;
				sum1=sum1+rem;
				sum=sum/10;
			}
			return sum1;
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		 int res= UserMainCode.getDigitSum(num);
		 System.out.println(res);

	}

}
