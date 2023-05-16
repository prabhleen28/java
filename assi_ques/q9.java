package assi_ques;
import java.util.*;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int f=sc.nextInt();
		int c=-1;
		int i=0;
		for(i=0;i<n;i++) {
			if(arr[i]==f) {
				c=1;
				break;
			}
			else {
				c=-1;
			}
		}
		if(c==1) {
			System.out.print(i);
		}
		else {
			System.out.print("-1");
		}
	}

}
