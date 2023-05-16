package coding_block;
import java.util.*;
public class sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			if(a[i]==k) {
				c++;
			}
			else if(a[i]!=0) {
				for(int j=i+1;j<n;j++) {
					if(a[i]+a[j]==k) {
						c++;
					}
				}
			}
		}
		System.out.print(c);
	}

}
