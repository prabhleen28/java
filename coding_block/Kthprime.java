package coding_block;

	import java.util.Scanner;

	public class Kthprime {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = 81;
	        int k = 5;
	        int[] arr=new int[n/2];
	        int p=n;
	        int m=0;
	        for(int i=2;i<p/2;i++){
	            while(n%i==0){
	                arr[m++] = i;
	                n=n/i;
	            }

	        }
	        if(k>m){
	            System.out.print(-1);

	        }
	        else{
	            System.out.print(arr[k-1]);
	        }
//	        System.out.print(arr[k]);
	    }
	}

