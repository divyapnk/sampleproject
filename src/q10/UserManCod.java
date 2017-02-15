package q10;

import java.util.Scanner;

public class UserManCod {
	static int c=0;
	static int sum=0;
	static int b[];

	public static int getString(int a[],int s)
	{
		for(int i=0;i<s;i++)
		{
	
			if(a[i]%2!=0) {
				c++;
			}
		}
		if(c==s) {
			int op=-1;
//			System.out.println(op);
			return op;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					b[i]=a[i];
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)  {
				sum+=b[i];
			}
		}
		return sum;
	}
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();		
			int a[]=new int[s];
			for(int i=0;i<s;i++)
				a[i]=sc.nextInt();
			System.out.println(UserManCod.getString(a,s));
			sc.close();
	}
}



	
