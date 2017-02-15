package q39;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
		al1.add(sc.nextInt());
		}
		for (int i = 0; i < a; i++) {
		al2.add(sc.nextInt());
	
		}

		ArrayList<Integer>al4=q39.UserMainCode.sortMergedArrayList(al1, al2);
		System.out.println(al4);
		sc.close();
	}

}
