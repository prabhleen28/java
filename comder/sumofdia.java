package comder;

public class sumofdia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,d=0;
		int sq=n*n;
		while(sq!=0) {
			int s=sq%10;
			d+=s;
			sq=sq/10;
			if(d==n) {
				break;
			}
		}
		System.out.print(n);
	}

}
