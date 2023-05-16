public class array{
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,5,6,7};
		int target=9;
//		print pairs=2,7  6,3;
//		for(int i=0;i<8;i++) {
//			for(int j=0;j<8;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println(arr[i]+","+arr[j]);
//				}
//			}
//		}
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]+arr[end]==target) {
				System.out.println(arr[start]+" "+arr[end]);
				start++;
				end--;
			}
			else if(arr[start]+arr[end]<target) {
				start++;
			}
			else {
				end--;
			}
		}
	}
}