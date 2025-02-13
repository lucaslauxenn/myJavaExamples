package multiThreading;

public class MyThreads extends Thread {


    // While Thread-0 will be counting from 1 to 100,
    // Thread-1 will be counting from -1 to -100
    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        if (threadName.equals("Thread-0")) {  //Only Thread-0 will run this block.
            for (int i = 1; i < 100; i++) {
                System.out.println(i + " by " + threadName);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) { // In case the program interrupts the sleeping thread.
                    throw new RuntimeException(e); //Wrapping the checked exception into an unchecked.
                }                                  // (Chained Exception)
            }
        }
        if (threadName.equals("Thread-1")) {   //Only Thread-1 will run this block.
            for (int i = -1; i > -100; i--) {
                System.out.println(i + " by " + threadName);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}

