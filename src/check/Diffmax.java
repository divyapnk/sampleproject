package check;

import java.util.Scanner;

public class Diffmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int[] n1=new int[s];
		for (int i = 0; i < s; i++) {
			n1[i]=sc.nextInt();
		}
		System.out.println(getDiffArray(n1));
	}

	public static int getDiffArray(int[] n1){
		int n2,max=0,indx=0,i;
		for(i=0;i<n1.length-1;i++){
			n2=Math.abs(n1[i]-n1[i+1]);
			System.out.println("n2= "+n2);
			if(n2>max){
				max=n2;
				System.out.println("Max diff= "+max);
				if(n1[i]>n1[i+1])
					indx=i;
				else
					indx=i+1; 
			}
		}
		return indx;
	}	


}
