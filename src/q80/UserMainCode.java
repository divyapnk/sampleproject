package q80;

import java.util.Arrays;

public class UserMainCode {

	public static float getBoundaryAverage(int[] a) {
		Arrays.sort(a);
		int sum = a[0] + a[a.length - 1];
		float avg = (float) sum / 2;
		return avg;
	}
}
