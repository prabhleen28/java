package assi_ques;

import java.util.*;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s1 = 0;
		int s2 = 0;
		while(n!=0) {
			int c=n%10;
			n=n/10;
			if(c%2==0) {
				s1+=c;
			}
			else {
				s2+=c;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
