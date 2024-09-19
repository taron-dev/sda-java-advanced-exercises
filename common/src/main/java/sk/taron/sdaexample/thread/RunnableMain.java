package sk.taron.sdaexample.thread;

public class RunnableMain {

  public static void main(String[] args) {
    CustomRunnable myRunnable = new CustomRunnable();
    Thread thread = new Thread(myRunnable);
    thread.start();
  }
}
