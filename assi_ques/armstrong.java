package assi_ques;

import java.util.Scanner;

public class armstrong {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++) {
		int temp=i;
		int r=0;
		int sum=0;
		while(i!=0) {
			r=i%10;
			sum+=r*r*r;
			i=i/10;	
		}
		if(temp==sum) {
			System.out.println(i);
		}
	}
	}

}
