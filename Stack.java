//import java.util.*;
public class Stack {
	 
	int arr[];
	int top;
	int size;
	Stack(int n){
		top=-1;
		size=n;
		arr=new int[size];
	}
	public void push(int x) {
		top++;
		arr[top]=x;
	}
	public void pop() {
		
		System.out.print(arr[top]);
		top--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack(5);
		s.push(5);
		s.push(2);
		s.pop();
		
	}

}
