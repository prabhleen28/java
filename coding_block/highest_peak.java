package coding_block;
import java.util.Scanner;

public class highest_peak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		if(n==0)
			System.out.print(0);
		else if(a[0]>=a[1])
			System.out.print(a[0]);
		else if(a[n-1]>=a[n-2])
			System.out.print(a[n-1]);
		else {
		for(int i=1;i<n-1;i++) {
			if(a[i]>=a[i-1] && a[i]>=a[i+1]) {
				System.out.print(a[i]);
				break;}

	}

}
	}
}
	
