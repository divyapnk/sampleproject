package set131;

import java.util.StringTokenizer;

public class ClassSet31 {
	public static String retrieveName(String s1){
		StringTokenizer t=new StringTokenizer(s1," ");
		String s2=t.nextToken();
		String s3=t.nextToken();
		StringBuffer sb=new StringBuffer(s2);
		sb.append(',').append(s3.charAt(0));
		return sb.toString();
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Bhavane Raghupathi";
		System.out.println(retrieveName(s1));


	}

}
