package assi_ques;
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;i++) {
			c=c*x;
		}
		System.out.print(c);
	}

}
