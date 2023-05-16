package str_assign_ques;
import java.util.*;
public class Q1_chr_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.nextLine());
		char c=sc.next().charAt(0);
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				flag=true;
			}
			else {
				flag=false;
			}
		}
		System.out.print(flag);
	}

}
