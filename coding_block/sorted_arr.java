package coding_block;
import java.util.*;
public class sorted_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int max=0;
			for(int j=0;j<n;j++) {
				
				if(a[j]>max) {
					max=a[j];
				}
			}
			
		for(int k=0;k<n;k++) {
			if(a[k]==max) {
				System.out.print(k);
				a[k]=-1;
				break;
			}
			
		}
	}

}
}
