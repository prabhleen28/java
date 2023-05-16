package str_assign_ques;

import java.util.Scanner;

public class Q2_ind_of_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.nextLine());
		char c=sc.next().charAt(0);
//		boolean flag=false;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				break;
			}
			else {
				count++;
			}
		}
		System.out.print(count+1);
	}

}
