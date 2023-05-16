package Multi_Dimension_arr;
import java.util.*;
public class sum_of_rows_cols {

	static void max_sum(int[][] a,int r,int c) {
		int max_r_sum=0;
		int c1=0;
		for(int i=0;i<r;i++) {
			
			int sum=0;
			for(int j=0;j<c;j++) {
				sum+=a[i][j];
			}
//			max_r_sum=sum;
			if(max_r_sum<sum) {
				max_r_sum=sum;
				c1=i;
			}
		}
//		System.out.print(max_r_sum);
		int max_c_sum=0;
		int c2=0;
		for(int j=0;j<c;j++) {
			int sumc=0;
			for(int i=0;i<r;i++) {
				sumc+=a[i][j];
			}
			if(max_c_sum<sumc) {
				max_c_sum=sumc;
				c2=j;
			}
		}
//		System.out.print(max_c_sum);
		if(max_r_sum>max_c_sum) {
			System.out.print("row"+" "+c1+" "+max_r_sum);
		}
		else{
			System.out.print("column"+" "+c2+" "+max_c_sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		max_sum(a,r,c);
	}

}
