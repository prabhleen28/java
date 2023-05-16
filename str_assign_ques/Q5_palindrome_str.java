package str_assign_ques;
import java.util.*;
public class Q5_palindrome_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		StringBuilder str=new StringBuilder(sc.nextLine());
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				flag=false;
			else
				flag=true;
			i++;
			j--;
			
		}
//		flag=true;
		System.out.print(flag);
	}
	

}
