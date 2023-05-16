package str_assign_ques;
import java.util.*;
public class Q4_whitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ans="";
		StringBuilder str=new StringBuilder(sc.nextLine());
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			else {
				ans+=str.charAt(i);
			}
		}
		System.out.print(ans);
		
	}

}
