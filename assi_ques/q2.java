package assi_ques;
import java.util.*;
public class q2 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
        int b=1;
        if(n==0)
        {
            System.out.print(" true");
        }
        while((a+b)<=n)
        {int temp=a+b;
         a=b;
         b=temp;
         // 
         if(n==temp )
         {
        	 System.out.print(" true");
         }
        }
        System.out.print(" false");
		
	}

}
