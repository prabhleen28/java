package string_assign_ques_3;
import java.util.*;
public class Q7_second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		int max=0;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)>max) {
				max=sb.charAt(i);
			}
			else {
				continue;
			}
		}
		System.out.print(max);
	}

}
