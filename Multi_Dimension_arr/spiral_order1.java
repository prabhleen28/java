package Multi_Dimension_arr;

import java.util.Scanner;

public class spiral_order1 {

	static void printmatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j < matrix[i].length;j++) {
			System.out.print(matrix[i][j]+" ");
		}
			System.out.println();
	}
	}
	
	static int[][] generatespiral(int n){
		int[][] matrix=new int[n][n];
		
		int topRow=0, bottomRow=n-1,leftcol=0,rightcol=n-1;
		int curr=1;
		
		while(curr<=n*n) {
			for(int j=leftcol;j<=rightcol && curr<=n*n;j++) {
				matrix[topRow][j]=curr++;
			}
			topRow++;
			for(int i=topRow;i<=bottomRow && curr<=n*n;i++) {
				matrix[i][rightcol]=curr++;
			}
			rightcol--;
			for(int j=rightcol;j>=leftcol && curr<=n*n;j--) {
				matrix[bottomRow][j]=curr++;
			}
			bottomRow--;
			for(int i=bottomRow;i>=topRow && curr<=n*n;i--) {
				matrix[i][leftcol]=curr++;
			}
			leftcol++;
		}
		return matrix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] matrix=generatespiral(n);
		printmatrix(matrix);

	}

}
