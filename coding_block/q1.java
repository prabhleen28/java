package coding_block;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int m=sc.nextInt();
		int [][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			
				for(int k=0;k<3;k++) {
					for(int h=0;h<3;h++) {
					if(k==1 && h==0 || h==2) {
						arr[k][h]=0;
					}
					sum+=arr[k][h];
				}
				}
				System.out.println(sum);
				
			}
		}
		
	}


