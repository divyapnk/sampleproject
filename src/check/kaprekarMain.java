package check;

import java.util.Scanner;

public class kaprekarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int res=useerm.display(n);
		if(res==1)
			System.out.println("kaprekar");
		else
			System.out.println("Not kaprekar");
		}
}
