package assigmentOpps;

/*
 We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three method.
 */
abstract class Shape
{
	abstract void RectangleArea(int length, int breadth);
	void SquareArea(int side) {
		// TODO Auto-generated method stub
		
	}
	abstract void CircleArea(int radius);
	protected abstract void printshapee();
}
class Area extends Shape
{

	@Override
	void RectangleArea(int length, int breadth) 
	{
		int area = length*breadth;
		System.out.println("area of rectangle:"+area);
		
	}

	@Override
	void SquareArea(int side) {
		int area=side*side;
		System.out.println("Area of Square:"+area);
		
	}
	
	void CircleArea(int radius)
	{
		double area=Math.PI*radius*radius;
		System.out.println("area of cirlcle:"+area);
	}

	@Override
	protected void printshapee() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Q11_oops 
{
     public static void main(String[] args) 
     {
		Area obj = new Area();
		obj.RectangleArea(5, 10);
		obj.SquareArea(4);
		obj.CircleArea(3);
	}
}
