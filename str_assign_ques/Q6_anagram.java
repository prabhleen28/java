package str_assign_ques;
import java.util.*;
public class Q6_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.nextLine());
		String str2=new String(sc.nextLine());
		int l=str.length();
		int l2=str.length();
		boolean flag=false;
		if(l !=l2) {
			System.out.print(flag);
		}
//		char[] str1=str.toCharArray();
//		char[] str22=str2.toCharArray();
//		Arrays.sort(str1);
//		Arrays.sort(str22);
//		boolean result=Arrays.equals(str1, str22);
//		System.out.print(result);
		int sum=0,sum2=0;
		for(int i=0;i<str.length();i++) {
			sum+=(int)str.charAt(i);
			sum2+=(int)str2.charAt(i);
		}
		if(sum==sum2) {
			System.out.print("anagram");
		}
		else {
			System.out.print("not an anagram");
		}
	}

}
