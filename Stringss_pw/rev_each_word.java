package Stringss_pw;
import java.util.*;
public class rev_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="I am online educator";
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.nextLine());
		String ans="";
		
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				sb.append(ch);
			}
			else {
				sb.reverse();
				ans+=sb;
				ans+=" ";
				sb.delete(0,sb.length());
			}
		}
		sb.reverse();
		ans+=sb;
		System.out.print(ans);
		
	}

}
