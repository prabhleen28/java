package Stringss_pw;

public class count_rep_alphas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbcc";
		String ans=""+str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			if(curr==prev) {
				count++;
			}
			else {
				if(count>1)
					ans+=count;
				count=1;
				ans+=curr;
			}
			
		}
		if(count>1) ans=ans+count;
		System.out.print(ans);
	}

}
