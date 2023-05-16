package coding_block;

public class prime_facts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int arr[]=new int[n];
		
		while (n % 2 == 0) {
			for(int i1=0;i1<n;i1++) {
//            System.out.print(2 + " ");
			arr[i1]=2;
            n /= 2;
        }
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
            	arr[i1]=i;
                n /= i;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
//        	arr[i1]=n;
	}
//		for(int j=0;j<n;j++) {
//			System.out.print(arr[j]+" ");
//		}

}
}
