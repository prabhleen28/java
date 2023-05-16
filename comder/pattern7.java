package comder;

public class pattern7 {
	public static void main(String args[]) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=0;sp<i-1;sp++) {
				System.out.print(" ");
			}
			for(int j= i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}