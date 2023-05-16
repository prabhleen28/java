package Multi_Dimension_arr;

import java.util.Scanner;

 
public class sum_of_rows {

	static void sum(int[][] a,int r,int c) {
		
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum+=a[i][j];
			}
			System.out.print(sum+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter rows and cols");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		System.out.print("enter elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sum(a,r,c);
	}

}
