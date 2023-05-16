import java.util.*;
public class Sumofarr{
	public int Calsum(int[] arr,int size) {
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	int size=input.nextInt();
	int arr[];
	arr=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=input.nextInt();
	}
	Sumofarr s= new Sumofarr();
	System.out.println(s.Calsum(arr,size));
	
}
}