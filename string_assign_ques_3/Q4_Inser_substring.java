package string_assign_ques_3;
import java.util.*;
public class Q4_Inser_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		StringBuilder sb1=new StringBuilder(sc.nextLine());
		int n=sc.nextInt();
		sb=sb.insert(n,sb1);
		System.out.print(sb);
	}

}
