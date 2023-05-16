package str_assign_ques;
import java.util.*;
public class Q10_Rotate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.nextLine());
		int n1=sc.nextInt();
		int n=str.length();
		int l=n-n1;
		String str2="";
		for(int i=0;i<n;i++) {
			if(i>=l)
				str2+=str.charAt(i);
		}
		System.out.print(str2);
		for(int i=0;i<l;i++) {
			System.out.print(str.charAt(i));
		}
	}

}
