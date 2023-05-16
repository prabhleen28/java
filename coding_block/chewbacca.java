package coding_block;
import java.util.*;
public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				long n = sc.nextLong();
				long ans =0;
				long place = 1;
				while(n != 0){
					long last = n % 10;
					if(last >= 5){
						long  invert = 9 - last;
						if(n/10 == 0 && n == 9){
							invert = n;
						}
						ans = ans + place*invert;
					}
					else{
						ans = ans + place*last;
					}
					n = n/10;
					place = place*10;
				}
					System.out.print(ans);
					}
		
	}


