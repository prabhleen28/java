package coding_block;

import java.util.Scanner;

public class dec_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] binaryNum = new int[1000];
		  
        // counter for binary array
        int i = 0;
        int c=0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]+" ");
        if(binaryNum[j]==1) {
        	c++;
        }
        
	}
        System.out.println(c);

}
}
