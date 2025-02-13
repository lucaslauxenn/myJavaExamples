package multiThreading;

public class Main {

    // The following method utilizes 4 Threads in total (main,Garbage Collector,Thread-1,Thread2)
    public static void main(String[] args) {

        // Creating (instantiating) new threads from the extended class MyThreads.
        MyThreads thread1 = new MyThreads();
        MyThreads thread2 = new MyThreads();

        //Making them execute run() from MyThreads.
        thread1.start();
        thread2.start();

    }
}

