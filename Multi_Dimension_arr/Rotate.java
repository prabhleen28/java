package Multi_Dimension_arr;

import java.util.Scanner;

public class Rotate {

	static void printmatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j < matrix[i].length;j++) {
			System.out.print(matrix[i][j]+" ");
		}
			System.out.println();
	}
	}
	static int[][] transpose(int[][] matrix, int r, int c) {
		int[][] ans=new int[c][r];
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				ans[i][j]=matrix[j][i];
			}
		}
		return ans;
	}
//		printmatrix(ans);
	static void reversearray(int[] arr) {
		
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	static void rotate(int [][]matrixx,int n) {
		transpose(matrixx,n,n);
		for(int i=0;i<n;i++) {
			reversearray(matrixx[i]);
		}
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number of rows and columns of matrix 1");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int [][] a=new int[r1][c1];
		System.out.print("Enter mstrix value: ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		printmatrix(a);
		rotate(a,r1);
		printmatrix(a);
	}

}
