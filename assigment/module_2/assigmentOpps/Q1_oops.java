package assigmentOpps;

/*
 Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side of square
 */

class type
{
    int length,width;
	public void rectangle()
	{
		this.length =10;
		this.width = 20;
		System.out.println("Area of rectangle;.."+(length*width));
	
	
		
	}
	int side;
	public void rectangle1()
	{
		side=5;
		System.out.println("area of square:"+(side*side));
	}
}
  
public class Q1_oops 
{
	public static void main(String[] args) {
		
	
    type t1=new type();
    t1.rectangle();
    t1.rectangle1();
}
}
