package assigmentOpps;

/*
 /*
 Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by
*/
  class Shapee{
	  public void printshape()
	  {
		  System.out.println("this is a shape");
	  }
  }
  class Rectangles extends Shapee
  {
	  public void printshape()
	  {
		  System.out.println("this is a rectangle shape.");
	  }
  }
  class Circle extends Shapee
  {
	  public void printshape()
	  {
		  System.out.println("this is a circular shape");
	  }
  }
  class Squares extends Rectangles
  {
	  Squares() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void printshape()
	  {
		  System.out.println("square is a rectangle");
	  }
  }
public class Q13_oopss 
{
    public static void main(String[] args) 
    {
		Shapee shape = new Shapee();
		Rectangles rectangle = new Rectangles();
		Squares square = new Squares();
		shape.printshape();
		rectangle.printshape();
		square.printshape();
		
		
	}
}  
