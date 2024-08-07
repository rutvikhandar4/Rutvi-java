package MultiThreading_assigment;
/*
 W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution.

 */
          class MyThreades extends Thread {
		    @Override
		    public void run() {
		        try {
		            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		            Thread.sleep(2000); // Sleep for 2000ms
		            System.out.println("Thread " + Thread.currentThread().getId() + " has completed");
		        } catch (InterruptedException e) {
		            System.out.println("Thread interrupted");
		        }
		    }
		}

		public class Q3_MultiThreading {
		    public static void main(String[] args) {
		        MyThreades thread1 = new MyThreades();
		        MyThreades thread2 = new MyThreades();

		        thread1.start();
		        thread2.start();
		    }
		}


	

