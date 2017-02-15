package check;

public class ReverseSubstring {

	public static void main(String[] args) {
	
		String s1="xyzwabcd";
		int n1=2,n2=4;
		System.out.println(retrievalOfString(s1,n1,n2));
	}

	public static String retrievalOfString(String s1, int n1, int n2) {
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
//		String s2=sb.substring(n1, n1+n2);
//		return s2;
	
		StringBuffer sb1= new StringBuffer();
		String str= sb1.append(sb.substring(n1, n1+n2)).toString();
		return str;
	}

	

}
