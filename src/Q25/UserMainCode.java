package Q25;

public class UserMainCode {	

	public static long convertDecimalToBinary(int n) {
		// TODO Auto-generated method stub
		long decimal_val = 0;
		int base = 1, rem;
		while (n > 0) {
			rem = n % 2;
			decimal_val = decimal_val + rem * base;
			n /= 2;
			base *= 10;
		}
		return decimal_val;	
	}
}
