package Multi_Dimension_arr;

import java.util.Scanner;

public class triplet_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
//		int n=nums.length;
        int [][]num1=new int[n][3];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.print(nums[i]+" "+nums[j]+" "+nums[k]);
                    }
                }
            }
        }
	       
	}

}
