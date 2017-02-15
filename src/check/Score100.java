package check;

import java.util.Scanner;

public class Score100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++){
        	arr[i] = sc.nextInt();
        }        
        System.out.println(consecutiveNum(arr, n));
}

public static boolean consecutiveNum(int arr[], int n){
        boolean b = false;
        for(int i=0;i<n-1;i++){
        	if(arr[i] == 100){
        		if(arr[i+1] == 100){
        			b = true;
        			break;
        		}
        	}
        }
        return b;
}
}