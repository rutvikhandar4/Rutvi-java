package AssigmentException;

/*
 W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.

 */
 
           class InsufficientBalanceException extends Exception {
	       public InsufficientBalanceException(String message) {
	           super(message);
	       }
	   }

	   class Account {
	       private int balance;

	       public Account(int balance) {
	           this.balance = balance;
	       }

	       public void withdraw(int amount) throws InsufficientBalanceException {
	           if (amount > balance) 
	           {
	               throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + (amount - balance) + " Rs. to perform this transaction.");
	           } else {
	               balance -= amount;
	               System.out.println("Amount withdrawn successfully. Remaining balance: " + balance);
	           }
	       }
	   }

	   public class Q7_Exception {
	       public static void main(String[] args) {
	           Account account = new Account(2000);
	           int withdrawAmount = 2500;

	           try {
	               account.withdraw(withdrawAmount);
	           } catch (InsufficientBalanceException e) {
	               System.out.println(e.getMessage());
	           }
	       }
	   }


	  
   

