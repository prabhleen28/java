package assi_ques;
import java.util.Scanner;
public class searching_element {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in); 
					int rows = sc.nextInt();
					   int cols = sc.nextInt();
					   int[][] numbers = new int[rows][cols];
					   //input
					   for(int i=0;i<rows;i++) {
						   for (int j=0;j<cols;j++) {
							   numbers[i][j]=sc.nextInt();
						   }
					   }
					   int x=sc.nextInt();
					   int c=0;
					   int i;
					   int j = 0;
					   for( i=0;i<rows;i++) {
						   for( j=0;j<cols;j++) {
							   //compare with x
							   if (numbers[i][j]==x) {
								   c=1;
								   break;
//								   System.out.println("x found at location ("+i+","+j+")");
								   
							   }
							   else {
								   c=0;
								   continue;
//								   System.out.print("not found");
				
							   }
							   
						   }
					   }
					   if(c==1) {
						   System.out.println("x found at location ("+i+","+j+")");
						   
					   }
					   else {
						   System.out.print("not found");
					   }
				

			}

		
	}


