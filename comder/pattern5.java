package comder;

public class pattern5 {
	public static void main(String args[]) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=0;sp<i-1;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
