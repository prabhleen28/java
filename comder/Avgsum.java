package comder;

import java.util.Scanner;

public class Avgsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0,min=100;
		float sum=0.0f;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			sum+=arr[i];
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		int sum1=max+min;
		float avg=(float) ((sum)-sum1)/(n-2);
		System.out.print(String.format("%.1f",avg));
		
		
		
		
	}

}
