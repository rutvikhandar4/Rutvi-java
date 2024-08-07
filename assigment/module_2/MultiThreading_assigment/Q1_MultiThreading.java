package MultiThreading_assigment;
/*
 Here is the full Java program that creates a thread by implementing the Runnable interface in a class:

 */

   
	      // Define a class that implements the Runnable interface
		   class MyThread implements Runnable {
		       @Override
		       public void run() {
		           // Code that will run in the thread
		           System.out.println("Thread is running");
		       }
		   }

		   public class Q1_MultiThreading {
		       public static void main(String[] args) {
		           // Create an instance of the MyThread class
		           MyThread myThread = new MyThread();
		        		   

		           // Create a Thread object and pass the MyThread instance to it
		           Thread thread = new Thread(myThread);

		           // Start the thread
		           thread.start();
		       }
		   }



   


