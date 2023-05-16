package comder;


public class ClassandObject {
	int height;
	int width;
	String type_box;
	boolean bool;
	ClassandObject (){//this is constructor
		this.height=5;
		this.width=2;
		this.type_box="rect";
		System.out.print("new object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassandObject cube=new ClassandObject ();
		//int i;
//		ClassndObject cuboid;
//		cuboid=new ClassndObject ();
		System.out.print(cube.height+" "+cube.width+" "+cube.type_box+" "+cube.bool);//0 0 null
		//System.out.print(i);//error bcz not initialize--no garbage vale

	}

}