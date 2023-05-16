package Multi_Dimension_arr;

import java.util.Scanner;

public class kadans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=Integer.MIN_VALUE;
		int curr_sum=0;
		for(int i=0;i<n;i++) {
			curr_sum+=arr[i];
			sum=Math.max(curr_sum,sum);
			curr_sum=Math.max(curr_sum, 0);
		}
		System.out.print(sum);
	}

}
