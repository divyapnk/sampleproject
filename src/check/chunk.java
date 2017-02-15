package check;

import java.util.Scanner;
import java.util.StringTokenizer;

public class chunk {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(getLargestSpan(s)==-1)
			System.out.println("No Chunks");		
		else
			System.out.println(getLargestSpan(s));		
	}
				
	public static int getLargestSpan(String a){
		StringTokenizer st=new StringTokenizer(a," ");
		int max=0;
		while(st.hasMoreTokens()){
			String s=st.nextToken();
			StringBuffer sb=new StringBuffer(s);
			for(int i=0;i<sb.length();i++){
				int count=0;
				for(int j=i+1;j<sb.length();j++){
					if(sb.charAt(i)==sb.charAt(j))
						count++;					
				}
				if(count>max)
					max=count+1;				
			}
		}
		if(max==0)
			return -1;		
		else
			return max;		
	}		
}
