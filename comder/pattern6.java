package comder;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
		
			for(int sc=n-i;sc!=0;sc--) {
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
		}
	}

}
