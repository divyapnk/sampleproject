package Q17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMainCode {
	public static int[] arrayListSubtractor(ArrayList<Integer> A,ArrayList<Integer> B){
		ArrayList<Integer> op=new ArrayList<Integer>();
		op.addAll(A);
		op.removeAll(B);
		B.removeAll(A);
		op.addAll(B);
		Collections.sort(op);
		int a[]=new int[op.size()];
		for(int i=0;i<op.size();i++){
			a[i]=op.get(i);
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		ArrayList<Integer> B=new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			A.add(sc.nextInt());
		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++){
			B.add(sc.nextInt());
		}
		int a[]=UserMainCode.arrayListSubtractor(A, B);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		sc.close();
	}
}
