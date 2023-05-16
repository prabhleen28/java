package Multi_Dimension_arr;

import java.util.Scanner;

public class Transpose {

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
//		printmatrix(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number of rows and columns of matrix 1");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][] a=new int[r][c];
		System.out.print("Enter mstrix value: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int[][] ans=transpose(a,r,c);
		printmatrix(ans);
		
		
	}

}
