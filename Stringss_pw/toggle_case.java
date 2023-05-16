package Stringss_pw;
import java.util.*;
public class toggle_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.nextLine());
//		System.out.print(str);
		
		for(int i=0;i<str.length();i++) {
			boolean flag=true;
			char ch=str.charAt(i);
			if(ch == ' ')
				continue;
			int asci=(int)ch;
			if(asci>=97)
				flag=false;
			if(flag==true) {
				asci+=32;
				char dh=(char)asci;
				str.setCharAt(i,dh);
			}
			else {
				asci-=32;
				char dh=(char)asci;
				str.setCharAt(i,dh);
			}
			
			
		}
		System.out.print(str);
	}
	

}
