package Q28;

import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class UserMainCode {

	public static boolean isLeapYear(String s) {		
		// TODO Auto-generated method stub
		
		boolean b=false;
		StringTokenizer st = new StringTokenizer(s, "/");
		while (st.hasMoreTokens()) {
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
		
			GregorianCalendar gc = new GregorianCalendar();
			b = gc.isLeapYear(year);		
		}
		return b;	
	}
}
