package main.com.jse.lect10;

public class MainThreadHandler {
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
//        firstThread.run();

        SecondThread secondThread = new SecondThread();
//        firstThread.join();
        secondThread.run();
//        FirstThread secondThread = new FirstThread();
//        secondThread.start();
//        secondThread.run();
    }
}
