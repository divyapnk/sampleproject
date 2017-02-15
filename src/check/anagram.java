package check;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		boolean b= checkAnagram(s1,s2);
		if(b==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	public static boolean checkAnagram(String s1, String s2) {
		List<Character> l1=new ArrayList<Character>();
		List<Character> l2=new ArrayList<Character>();
		List<Character> l3=new ArrayList<Character>();
			
		String s3=s1.toUpperCase();
		String s4=s2.toUpperCase();
		for (int i = 0; i < s3.length(); i++) {
			l1.add(s3.charAt(i));
		}
		for (int i = 0; i < s4.length(); i++) {
			l2.add(s4.charAt(i));
		}
		l3.add(' ');
		l1.removeAll(l3);
		l2.removeAll(l3);
		Collections.sort(l1);
		Collections.sort(l2); 
		
		if(l1.equals(l2))
			return true;
		else
			return false;
	}

}
