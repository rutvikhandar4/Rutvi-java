package assigmentOpps;
/*
 Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
  a class named 'Triangle' without any parameter in its constructor.
 */
class Triangle
{
	int side1= 3;
	int side2= 4;
	int side3= 5;
	public void calculateArea()
	{
		double s = (side1 + side2 + side3)/2.0;
		//double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("area of triangle:"+s);
	}
	public void calculatePerimeter()
	{
		int perimeter = side1+side2+side3;
		System.out.println("perimeter of tringle:"+perimeter);
	}
}

public class Q5_oops 
{
   public static void main(String[] args)
   {
	   Triangle triangle = new Triangle();
	   triangle.calculateArea();
	   triangle.calculatePerimeter();
   }
}
