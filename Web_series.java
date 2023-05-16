import java.util.*;

class Web_series{
	String title;
	int seasons;
	double rating;
	void current_series() {
		System.out.println("Current series is: "+title);
		System.out.println("Current series rating is: "+rating);
		
	}
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		Web_series series1=new Web_series();
		Web_series series2=new Web_series();
		series1.title=input.nextLine();
		series1.seasons=input.nextInt();
		series1.rating=input.nextDouble();
		series1.current_series();
		
		
		series2.title="brooklyn nine-nine";
		series2.seasons=10;
		series2.rating=9.9;
		series2.current_series();
	}
}