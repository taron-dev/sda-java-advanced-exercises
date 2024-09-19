package sk.taron.sdaexample.thread;

public class ThreadPlaygroundRunnableMain {

  public static void main(String[] args) {
    // Initialize the threads with different names
    // Two static Thread fields
    Thread thread1 = new Thread(new ThreadPlaygroundRunnable("Runnable-1"));
    Thread thread2 = new Thread(new ThreadPlaygroundRunnable("Runnable-2"));

    // Start both threads
    thread1.start();
    thread2.start();
  }
}
