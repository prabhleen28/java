package string_assign_ques_3;

import java.util.Scanner;

public class Q3_concat_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		StringBuilder sb1=new StringBuilder(sc.nextLine());
		sb=sb.append(sb1);
		System.out.print(sb);
	}

}
