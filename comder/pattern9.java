package comder;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int sp=n-i;sp>0;sp--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int start=i-1;start!=0;start--) {
				System.out.print(start);
			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print(j);
//			}
			System.out.println();
		}
	}

}
