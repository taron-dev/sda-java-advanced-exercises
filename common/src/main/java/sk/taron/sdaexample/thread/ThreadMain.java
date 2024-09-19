package sk.taron.sdaexample.thread;

public class ThreadMain {
  public static void main(String[] args) {
    CustomThread myThread = new CustomThread();
    myThread.start();
  }
}
