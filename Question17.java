
/*
# TYPES OF BOXES
-Separate object
-Constructor initialization(custom)
-Print each step of the process 

 Process 
 1.object has been created
 Square BOX ,Rectangle,oval;
 
 2.HEight,width and depth has been set.
   values
 3.Volume calculated for same is ___. 
 

 */
import java.util.*;
public class Question17{
	double height;
	double width;
	double depth;
	String Type_of_box;
	boolean f;
	
	Question17()
	{
		
		this(0,0,0);
		System.out.println("The Constructor has been initialized");
	}
	Question17(double default_height ,double default_width ,double default_depth)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the type of box");
		this.Type_of_box=sc.nextLine();
		System.out.print("Enter the height,width and depth of "+ this.Type_of_box + "box");
		this.height =Double.parseDouble(sc.nextLine());
		this.width =Double.parseDouble(sc.nextLine());
		this.depth =Double.parseDouble(sc.nextLine());
		System.out.println("Object "+this.Type_of_box+"has been created");
		System.out.println("The height is "+ this.height);
		System.out.println("The height is "+ this.width);
		System.out.println("The height is "+ this.depth);
	}
		void vol(double i) {
		double volume;
		volume=this.height * this.height*this.height;
		System.out.println("Volume is "+volume);
		}
		void vol(double i,double j,double k){
			double volume;
			volume=this.height * this.width*this.depth;
			System.out.println("Volume is "+volume);
		}
		void vol(double i,double j){
			double volume;
			volume=3.14*this.height * this.height*this.width;
			System.out.println("Volume is "+volume);
		}
		

	public static void main(String[] args)
	{
		Question17 box = new Question17();
		if (box.Type_of_box.equals("cube"))
		{
			box.vol(box.height);
		}
		else if(box.Type_of_box.equals("cuboid"))
		{
			box.vol(box.height,box.width);
		}
		else
		{
			box.vol(box.height,box.width,box.depth);
		}
		
	}
}