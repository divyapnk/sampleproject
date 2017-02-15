package check;

import java.util.ArrayList;
import java.util.Scanner;

public class q39Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		for (int i = 0; i < a; i++) {
			al1.add(sc.nextInt());
		}
		for (int i = 0; i < a; i++) {
			al2.add(sc.nextInt());
		}
		
		al3 = q39ArrayLst.getElem(al1, al2);
		for (int i = 0; i < args.length; i++) {
			System.out.println(al3.get(i));
			
//			al3.get(i);
		}

	}

}
