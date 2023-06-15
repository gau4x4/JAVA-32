package main.com.jse.lect11;

public class DeadlockHelper2 extends Thread{
    @Override
    synchronized public void run(){
        synchronized(ThreadDeadLock.RESOURCE2){
            System.out.println("Thread2::Inside first sync Block: Holding Lock2");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2::Waiting for Lock1");
            synchronized (ThreadDeadLock.RESOURCE1){
                System.out.println("Thread2::Inside second sync Block: Holding Lock1");
            }
        }
    }
}
