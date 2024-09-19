package sk.taron.sdaexample.thread;

public class ThreadPlaygroundRunnable implements Runnable {

  private final String name;

  // Constructor to initialize the name field
  public ThreadPlaygroundRunnable(String name) {
    this.name = name;
  }

  // Implementing the run() method
  @Override
  public void run() {
    // Loop to iterate up to 10
    for (int i = 1; i <= 10; i++) {
      System.out.println("Thread: " + Thread.currentThread().getName() + ", Name: " + name + ", Iteration: " + i);
      try {
        // Sleep for a short time to better visualize the threading
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
