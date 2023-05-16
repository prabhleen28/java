package comder;

import java.util.Arrays;
import java.util.Scanner;

public class smallest_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[n-1]);
	}

}
