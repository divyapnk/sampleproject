package q39;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static ArrayList<Integer>sortMergedArrayList(ArrayList<Integer> al1,ArrayList<Integer> al2)
	{
	
		ArrayList<Integer> al3 = new ArrayList<Integer>();
	al1.addAll(al2);
	Collections.sort(al1);
	for (int i = 0; i < al1.size(); i++) {
	if (i == 2 || i == 6 || i == 8) {
	al3.add(al1.get(i));

}
	}
	return al3;
}
}
