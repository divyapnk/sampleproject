package check;

import java.util.ArrayList;
import java.util.Scanner;

public class remove10sMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=scanner.nextInt();
		}
		Integer op[]=getElem(a);
		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i]);
		}
	}
	
	public static Integer[] getElem(int[] a) {
		int k=0;
		ArrayList<Integer> al= new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=10)
				al.add(a[i]);
		}
		
		if(al.size()<a.length){
			k=a.length-al.size();
			
			for (int i = 0; i < k; i++) {
				al.add(0);				
			}
		}		
		Integer[]op= new Integer[al.size()];
		al.toArray(op);
		return op;				
	}

}
