package check;

import java.util.StringTokenizer;

public class InitialName {

	public static void main(String[] args) {
				
		String s1="vishal jadiya";
		getvalues(s1);
		}
		public static void getvalues(String s1) {
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(s1," ");
		String s2=st.nextToken();
		String s3=st.nextToken();
		sb.append(s3).append(", ");
		sb.append(s2.substring(0,1).toUpperCase());
		System.out.println(sb);
		}		
}
