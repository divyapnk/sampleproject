package check;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DOBValidation {

	public static void main(String[] args) {
		
//		String str=new String();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean b= dateValidation(str);
		if(b==true)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
	
	public static boolean dateValidation(String str) {
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		try
		{
			Date d1=sdf.parse(str);
			return true;
		}
		catch(Exception e)
		{
			return false;
//			System.out.println("FALSE");
		}		
	}

}
