package check;

import java.util.HashMap;
import java.util.Scanner;

public class stateCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		HashMap<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < a; i++) {
		hm.put(sc.next(), sc.next());
		}
		String s1 = sc.next();
		System.out.println(getCapital(hm,s1));
	}
	public static String getCapital(HashMap<String, String> hm, String s1) {
		String s3="";
		for (HashMap.Entry e : hm.entrySet()) {
			if (e.getKey().equals(s1)) {
				s3 = e.getValue() + "$" + e.getKey();
			}
		}
		return s3;
	}
}
