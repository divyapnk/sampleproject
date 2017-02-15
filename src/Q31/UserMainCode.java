package Q31;

public class UserMainCode {

	public static int checkLargestAmongCorner(int[] a) {
	
		int first = 0, mid = 0, last = 0;
		int res=0;
		int s=a.length;
		for (int i = 0; i < a.length; i++) {
			first = a[0];
			mid = a[(s - 1) / 2];
			last = a[s - 1];
			}
		if (first > mid) {
			
			res=first;
			} 
		else if (mid > last) {
			
			res=mid;
			
			} 
		else if (last > first) {
			
			res=last;

		}
		return res;
	}

}

