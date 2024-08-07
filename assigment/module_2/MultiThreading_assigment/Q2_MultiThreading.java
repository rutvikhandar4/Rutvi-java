package MultiThreading_assigment;
/*
 W.A.J. P to create one thread by extending Thread class in another Class.
 */

		class MyThreadss extends Thread {
		    @Override
		    public void run() {
		        // Code that will run in the thread
		        System.out.println("Thread is running");
		    }
		}
		
		public class Q2_MultiThreading  {
		    public static void main(String[] args) {
		        // Create an instance of the MyThread class
		        MyThreadss myThread = new MyThreadss();

		        // Start the thread by calling the start() method
		        myThread.start();
		    }
		}



