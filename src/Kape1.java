
public class Kape1 {
	
		public static double display(int n,int[]a)
		{
		int count=0,sum=0,n1=0;
		double avg=0;

		for(int i=2;i<n;i++)
		{
		count=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
		count++;
		}
		}
		if(count==2)
		{
		sum=sum+a[i];
		n1=n1+1;
		}
		}
		 avg=(double)(sum)/n1;
		return avg;
		}}



