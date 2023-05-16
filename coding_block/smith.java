
package coding_block;
import java.util.Scanner;

public class smith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum =0;
            int p = n;
            while(p!=0){
                sum = sum + p%10;
                p=p/10;
            }
            int q = n;
            int [] arr = new int[n];
            int k=0;
            for(int i=2;i<=q/2;i++){
                while(n%2==0){
                    arr[k++] = i;
                    n=n/i;
                }
            }
            int sum1=0;
            for(int i=0;i<k;i++){
                while(arr[i]!=0){
                    sum1 = sum1 + arr[i]%10;
                    arr[i] = arr[i]/10;
                }
            }
            System.out.print(sum1);
            if(sum1==sum){
                System.out.print("Smith number");
            }
            else{
                System.out.print("Not Smith");
            }
        }
    }
}