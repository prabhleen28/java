package str_assign_ques;

import java.util.Scanner;

public class Q3_Replace_char_wth_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.nextLine());
		char c=sc.next().charAt(0);
		String new_str=str.replace('n', (char) c);
		System.out.print(new_str);
		
	}

}
