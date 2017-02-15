package Q16;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMainCode {

	public static String[] fruitSelector(ArrayList<String> al1,ArrayList<String> al2){
		ArrayList<String> op=new ArrayList<String>();
		String k="";
		for(int i=0;i<al1.size();i++){
			k=al1.get(i);
			int len=k.length()-1;
			if(k.charAt(len)=='a' || k.charAt(len)=='e'){
				continue;
			}
			else{
				op.add(k);
			}
		}
		for(int i=0;i<al2.size();i++){
			k=al2.get(i);
			if(k.charAt(0)=='a' || k.charAt(0)=='m'){
				continue;
			}
			else{
				op.add(k);
			}
		}
//		if(op.isEmpty()){
//			//System.out.println("Invalid");
//			String[] res=new String[op.size()];
//			return res;
//		}
//		else {
			String s[]=new String[op.size()];
			op.toArray(s);
			return s;
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		ArrayList<String> al1=new ArrayList<String>();
		for(int i=0;i<m;i++){
			al1.add(sc.next());
		}
		int n=sc.nextInt();
		ArrayList<String> al2=new ArrayList<String>();
		for(int i=0;i<n;i++){
			al2.add(sc.next());
		}
		String s[]=UserMainCode.fruitSelector(al1,al2);
		
		for(int i=0;i<s.length;i++){
			if(s[i].isEmpty())
				System.out.println("No fruit found");
			else
				System.out.println(s[i]);
		}
		sc.close();
	}
}
