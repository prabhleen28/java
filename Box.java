import java.util.Scanner;
public class Box {
	double height;
	double width;
	double depth;
	String name_of_box;
	String type_box;
	boolean box_full;
	
	Box(){
		this(0,0,0);
	}
	Box(double height,double width,double depth){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the type of box");
		type_box=sc.nextLine();
		System.out.println("enter height, width, and dept of "+ type_box+ "box:");
		this.height=Double.parseDouble(sc.nextLine());
		this.width=Double.parseDouble(sc.nextLine());
		this.depth=Double.parseDouble(sc.nextLine());
//		this(height,width,depth);
		System.out.println(this.type_box + "box has been created");
		System.out.println("the height is : "+this.height);
		System.out.println("the width is : "+this.width);
		System.out.println("the depth is : "+this.depth);
		double vol;
		vol=this.height * this.width * this.depth;
		System.out.println("Volume is "+vol);
	}
	void volume() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box square=new Box();
		
	}

}
//this refrence to the obj.