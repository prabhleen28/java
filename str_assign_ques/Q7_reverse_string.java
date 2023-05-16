package str_assign_ques;
import java.util.*;
public class Q7_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.nextLine());
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}
		System.out.print(ans);
	}

}
