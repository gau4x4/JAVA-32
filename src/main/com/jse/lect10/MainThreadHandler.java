package main.com.jse.lect10;

public class MainThreadHandler {
    public static void main(String[] args) throws InterruptedException {
        long now1 = System.currentTimeMillis();
        TaskRunner tr = new TaskRunner();
        tr.printSomeWork("Without",1,100);
        System.out.println("Time taken without thread: "+(System.currentTimeMillis()-now1));

        long now = System.currentTimeMillis();
        FirstThread firstThread = new FirstThread();
//        firstThread.start();
        firstThread.start();

        FirstThread secondThread = new FirstThread();
//        firstThread.join();
        secondThread.start();
    System.out.println("Time taken with thread: "+(System.currentTimeMillis()-now));
//        FirstThread secondThread = new FirstThread();
//        secondThread.start();
//        secondThread.run();
    }
}
