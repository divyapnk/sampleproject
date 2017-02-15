package Q35;

import java.util.Arrays;

public class UserMainCode {
	public static int calculateMedian(int a[], int s){
		int mid;
		Arrays.sort(a);
		if (s % 2 != 0) {
			mid = a[(s - 1) / 2];
		} 
		else {
			mid = Math.round((a[s / 2] + a[(s / 2) - 1]) / 2);
		}
		return mid;

	}

}
