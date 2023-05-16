package assi_ques;
import java.util.*;
public class q8 {

	public static void sort(int[] arr,int n ) {
		int c=0;
		for(int k=0;k<n;k++) {
			if(arr[k]==0) {
				c++;
			}
		}int k=0;
		while(c--!=0) {
			arr[k]=0;
			k++;
			
		}
		while(k<n) {
			arr[k]=1;
			k++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		int c=0;
//		int c1=0;
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
            int arr[]=new int[n];
			for(int r=0;r<n;r++) {
				arr[r]=sc.nextInt();
			}
			sort(arr,n);
			for(int j=0;j<n;j++) {
				System.out.print(arr[j]+" ");
			}
			
			}
		}
		
	}


