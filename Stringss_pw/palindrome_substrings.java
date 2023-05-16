package Stringss_pw;

public class palindrome_substrings {

	public static boolean isPalidrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbd";
		int c=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++){
				if(isPalidrome(s.substring(i,j))==true){
					System.out.print(s.substring(i,j)+" ");
					c++;
				}
			}
		}
		System.out.print(c);

	}

}
