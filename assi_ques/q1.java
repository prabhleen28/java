package assi_ques;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int s,e,v;
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		int w=sc.nextInt();
//		int f;
		int c;
		for(int i=s;i<=e;i+=w) {
			 c=((5*(i-32))/9);
			System.out.print(i + "\t"+ c);
			System.out.println();
		}
	}

}
