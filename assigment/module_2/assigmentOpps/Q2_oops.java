package assigmentOpps;

/*
 Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class
 */
class family
{
	
	String parentname;
	public void parent()
	{
		
		parentname="atulbhai khandar"; 
		System.out.println("this is a parens class.");
	}
	}
class Child extends family{
	
	String childname;
	public void child()
	{
	
		childname="rutvi khandar";
		System.out.println("this is a child class");
	
	}

}

public class Q2_oops 
{
    public static void main(String[] args) 
    {
		family f1 = new family();
		Child c1= new Child();
		f1.parent();
		c1.child();
	}
}

