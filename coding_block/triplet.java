package coding_block;
import java.util.*;
public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(a[i]+a[j]==a[k] || a[j]+a[k]==a[i] || a[i]+a[k]==a[j]) {
						c++;
					}
				}
			}
		}
		System.out.print(c);
		
	}

}
