package comder;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		int z=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i || i+j==n+1) {
					System.out.print("* ");
				}
				
			else {
				System.out.print(" ");
			}
			}
			System.out.println();
		
	}

}
	}
