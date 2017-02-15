package check;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassSet37 {

	public static void main(String[] args) {
		int[] a={10,23,45,54,32,14,55,65,56};
		
		
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(i%2!=0)
				l.add(a[i]);
//			System.out.println("max: " +Collections.sort());
		
		}
//		for (int i = 0; i < a.length; i++) {
			
		
		System.out.println("max: " +Collections.max(l));
//				Collections.reverseOrder().toString());  
//		}
	}
}
