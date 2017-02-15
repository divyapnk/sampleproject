
	import java.util.Scanner;
import java.util.StringTokenizer;
	public class Main {
	public static void main(String[] args) {
	//String s1="this is just a misconception";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
	getvalues(s1);
	}
	public static void getvalues(String s1) {
	StringBuffer sb=new StringBuffer();
	StringTokenizer st=new StringTokenizer(s1," ");
	while(st.hasMoreTokens())
	{
	String s2=st.nextToken();
	if(s2.equals("is"))
	{
	String s3=s2.replace("is","is not");
	sb.append(s3);
	//sb.append(" ");
	}
	else
	sb.append(s2);
	sb.append(" ");
	}
	sb.delete(sb.length()-1, sb.length());
	System.out.println(sb);
	}
	}



