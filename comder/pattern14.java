package comder;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n-1;i>=1;i--) {
			
		
		for(int sp=0;sp<n-i;sp++) {
			System.out.print("  ");
		}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}
