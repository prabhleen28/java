import java.util.*;
public class floyds_tri {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int rows=1;rows<=n;rows++){
			for(int sp=n-rows;sp>0;sp--){
				System.out.print(" ");
			}
			for(int colm=1;colm<=2*rows-1;colm++){
				if(rows>=colm){
				System.out.print(colm+count);	
				}
				else{
					System.out.print(2*rows-colm+count);
				}
				
			}count++;
			System.out.println();
		}
		
    }
}