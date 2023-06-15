package main.com.jse.lect11;

public class ThreadDeadLock {
    public static String RESOURCE1 = "Deadlock";
    public static String RESOURCE2 = "Handler";
    public static void main(String[] args){
        DeadlockHelper1 dh1 = new DeadlockHelper1();
        DeadlockHelper2 dh2 = new DeadlockHelper2();
        dh1.start();
        dh2.start();
    }

}
