package Q21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserMainCode {

	public static int getAnagram(String s1,String s2){
		ArrayList<Character> a=new ArrayList<Character>();
		ArrayList<Character> b=new ArrayList<Character>();
		
		for(int i=0;i<s1.length();i++){
			a.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
			b.add(s2.charAt(i));
		}
		Collections.sort(a);
		Collections.sort(b);
		if(a.containsAll(b) || b.containsAll(a)){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int temp=UserMainCode.getAnagram(s1, s2);
		if(temp==1){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("Not Anagrams");
		}				
	}		
}
