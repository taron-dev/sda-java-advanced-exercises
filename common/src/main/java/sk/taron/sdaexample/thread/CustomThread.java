package sk.taron.sdaexample.thread;

public class CustomThread extends Thread {
  @Override
  public void run() {
    // Print the name of the current thread
    System.out.println("Thread is running: " + Thread.currentThread().getName());
  }
}
