import java.util.*;
public class Web_series1{
	String title;
	int seasons;
	double rating;
	void current_series() {
		System.out.println("Current series is:"+title);
		System.out.println("Current series is:"+seasons);
		System.out.println("Current series is:"+rating);
	}
	public static void main(String args[]) {
//		Web_series s1=new Web_series();
//		s1.title="Peaky Blinders";
//		s1.seasons=6;
//		s1.rating=10;
//		s1.current_series();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		//  String s=sc.next();
			Web_series1 s =new Web_series1();
			s.title=sc.next();
			s.seasons=sc.nextInt();
			s.rating=sc.nextDouble();
			s.current_series();
		}
		
	}
}