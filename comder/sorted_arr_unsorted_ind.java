package comder;

import java.util.Scanner;

public class sorted_arr_unsorted_ind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		int max=0;
		
		for(int j=0;j<n;j++) {
			
			if(arr[j]>max) {
				max=arr[j];
				
			}
		}
		for(int k=0;k<n;k++) {
			if(arr[k]==max) {
				System.out.print(k+" ");
				arr[k]=-1;
				break;
			}
		}
		}
		
	}

}

