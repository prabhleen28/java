package comder;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int sp=n-i;sp>0;sp--) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i;j++) {
				if(j%2==0)
				System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
