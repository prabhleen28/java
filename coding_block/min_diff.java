package coding_block;
import java.util.*;
public class min_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int min=999;
		int d=0;//1 4 9 32 13
		for(int i=1;i<n;i++) {
			d=a[i]-a[i-1];
			if(min>d) {
				min=d;
			}
		}
		System.out.print(min);

	}

}
