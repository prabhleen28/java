package assi_ques;
import java.util.*;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[];
		arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.print(sum);
	}

}
