package comder;

public class pattern10imp {
	public static void main(String args[]) {
		int n=5;
		for(int i=0;i<n;i++) {
//			int z=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
//				z++;
			}
			for(int j=1;j<=2*i;j++) {
				System.out.print("*");
			}
			for(int k=n-i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
}

