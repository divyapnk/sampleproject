package check;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxAdmission {

	public static void main(String[] args) throws Exception  {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int i = 0; i < 2*n; i++) {
			al1.add(sc.nextInt());
		}
		System.out.println(getYear(al1));						
	}
	public static Integer getYear(ArrayList<Integer> al1) {		
		int max=0,m=0;
		for (int i = 1; i < al1.size(); i=i+2) {			
				if(al1.get(i)>max) {					
					max=al1.get(i);
					m=i;
				}
		}
		return al1.get(m-1);
	}		
}
