package assigmentOpps;

/*
 Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are
subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.

 */
abstract class Bank
{
	abstract void getBalance();
}

class BankA extends Bank
{
	private int balance=100;

	@Override
	void getBalance() {
		System.out.println("balance in bank A: $"+balance);
		
	}
}
class BankB extends Bank
{
	private int balance =150;

	@Override
	void getBalance() 
	{
	   System.out.println("balance in bank b: $"+balance);	
    }
	
}
class BankC extends Bank
{
	private int balance = 200;

	@Override
	void getBalance() 
	{
		
		System.out.println("balance in bank c: $"+balance);
	}
}
public class Q8_oops 
{
 
public static void main(String[] args)
   {
	BankA bankA = new BankA();
	BankB bankB = new BankB();
	BankC bankC = new BankC();
	  bankA.getBalance();
	  bankB.getBalance();
	  bankC.getBalance();
	  
	  
   }
}
