# Thread

## 1st exercise
- Create class `CustomThread` which will extend `Thread` class.
- In run method print thread name
- start the tread in main to verify impl

## 2nd exercise
- Create class `CustomRunnable` which will implement `Runneable` interface.
- In run method print thread name
- start the tread in main to verify impl

## 3rd exercise
- Create a `ThreadPlaygroundRunnable` class that implements the Runnable interface
- the class should have a name field of type String with a public constructor for that field
- the class should contain a loop iterating up to 10 and print:
  - the threadName of the thread `Thread.currentThread().getName()`
  - the name given in the constructor
  - the current iteration number
