package main.com.jse.lect10;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        TaskRunner tr = new TaskRunner();
        tr.printSomeWork("Second");
    }
}
