import java.util.Scanner;

public class Kape{
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	
	
int []a=new int[20];
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
	a[i]=Integer.parseInt(sc.nextLine());
}

System.out.print(Kape1.display(n,a));
}}

