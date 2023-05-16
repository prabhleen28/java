package comder;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int sp=1;sp<=2*(n-i);sp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
//			for(int k=n-i;k>0;k--) {
//				System.out.print("* ");
//			}
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("* ");
			}
			for(int sp=1;sp<=2*(n-i);sp++) {
				System.out.print("  ");
			}
			for(int j=n-i;j>=0;j--) {
				System.out.print("* ");
			} 
			System.out.println();
		}
		
	}

}
