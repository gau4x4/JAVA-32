package main.com.jse.lect10;

public class FirstThread extends Thread{
    @Override
    public void run() {
//        super.run();
        TaskRunner tr = new TaskRunner();
        tr.printSomeWork("First",51,100);
    }
}
