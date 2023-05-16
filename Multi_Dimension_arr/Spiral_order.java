package Multi_Dimension_arr;

import java.util.Scanner;

public class Spiral_order {

	static void printmatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j < matrix[i].length;j++) {
			System.out.print(matrix[i][j]+" ");
		}
			System.out.println();
	}
	}
	static void spiral(int[][] matrix,int r,int c) {
		int topRow=0, bottomRow=r-1,leftcol=0,rightcol=c-1;
		int total=0;
		
		while(total<r*c) {
			for(int j=leftcol;j<=rightcol && total<r*c;j++) {
				System.out.print(matrix[topRow][j]+" ");
				total++;
			}
			topRow++;
			for(int i=topRow;i<=bottomRow && total<r*c;i++) {
				System.out.print(matrix[i][rightcol]+ " ");
				total++;
			}
			rightcol--;
			for(int j=rightcol;j>=leftcol && total<r*c;j--) {
				System.out.print(matrix[bottomRow][j]+" ");
				total++;
			}
			bottomRow--;
			for(int i=bottomRow;i>=topRow && total<r*c;i--) {
				System.out.print(matrix[i][leftcol]+" ");
				total++;
			}
			leftcol++;
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
		spiral(a,r1,c1);
//		printmatrix(a);
	}

}
