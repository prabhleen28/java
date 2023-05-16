package string_assign_ques_3;
import java.util.*;
public class Q6_remove_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		StringBuilder sb1=new StringBuilder("");
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)%2==0) {
				continue;
			}
			else {
				sb1.append(sb.charAt(i));
			}
		}
		System.out.print(sb1);
	}

}
