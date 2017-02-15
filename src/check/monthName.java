package check;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class monthName {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yy");
		sdf.setLenient(false);
		Date d1=sdf.parse(s1);
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMMM");
		String s2 = sdf1.format(d1);
		System.out.println(s2.toUpperCase());
		
	}

}
