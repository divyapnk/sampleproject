package check;


	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
	
public class q39ArrayLst {
	public static ArrayList<Integer> getElem(ArrayList<Integer> al1, ArrayList<Integer> al2) {
	ArrayList<Integer> al3 = new ArrayList<Integer>();
	al1.addAll(al2);
//	System.out.println(al1);
	Collections.sort(al1);
//	System.out.println(al1);
	for (int i = 0; i < al1.size(); i++) {
		if (i == 2 || i == 6 || i == 8) {
			al3.add(al1.get(i));
		}
	}
	return al3;		
	}
}
