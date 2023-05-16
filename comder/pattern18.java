package comder;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=n-i;sp>=0;sp--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=i+1;sp++) {
				System.out.print("  ");
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print("* ");
			} 
			System.out.println();
		}
	}

}
