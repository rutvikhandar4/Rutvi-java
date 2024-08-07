package assigmentOpps;

/*
 Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating an object for 
and each subclass
 */
abstract class parent
{
	abstract void message();
}
class FirstSubclass extends parent
{

	@Override
	void message() {
		System.out.println("this is first subclass");
		
	}
	
}
class SecondSubclass extends parent
{

	@Override
	void message() {
		System.out.println("this is second subclass");
		
	}
	
}
public class Q7_oops 
{
   public static void main(String[] args) 
   {
	 FirstSubclass first = new FirstSubclass();
	 SecondSubclass second = new SecondSubclass();
	 
	 first.message();
	 second.message();
   }
}
