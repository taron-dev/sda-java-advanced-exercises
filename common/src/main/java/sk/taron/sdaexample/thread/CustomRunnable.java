package sk.taron.sdaexample.thread;

public class CustomRunnable implements Runnable {
  @Override
  public void run() {
    // Print the name of the current thread
    System.out.println("Runnable is running: " + Thread.currentThread().getName());
  }
}
