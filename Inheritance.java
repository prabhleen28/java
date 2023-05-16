class A{
		int i,j;
//		void showij() {
//			System.out.print("i and j: "+i+" "+j);
//		}
		void show() {
			System.out.print("i and j: "+i+" "+j);
		}
	}
class B extends A{
		int k;
//		void showk() {
//			System.out.print("k: "+k);
//		}
//		void sum() {
//			System.out.print("i+j+k"+(i+j+k));
//		}
		void show() {
			System.out.print("i and j: "+i+" "+j);
		}
		
	}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A superob=new A();
		B subob=new B();
		System.out.print("contents of superob");
//		superob.show();
//		System.out.println();
		subob.show();
		
	}
	

}
