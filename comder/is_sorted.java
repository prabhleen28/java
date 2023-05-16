package comder;
import java.util.*;
public class is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) {
				c=1;
				continue;
			}
			else {
				c=0;
				break;
			}
		}
		System.out.print(c);
	}

}
