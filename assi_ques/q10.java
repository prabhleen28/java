package assi_ques;

import java.util.Scanner;

public class q10 {

	public static void populate(int n) {
		
		int arr[]= new int[n];
		int start=0,end=n-1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				arr[start++]=i;
			}
			if(i%2==0) {
				arr[end--]=i;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		populate(n);
	}

}
