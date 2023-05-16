package comder;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=2;sp<=i;sp++) {
				System.out.print("\t\t");
			}
			for(int j=n-i+1;j>=1;j--) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int sp=n-i-1;sp>=0;sp--) {
				System.out.print("\t\t");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
