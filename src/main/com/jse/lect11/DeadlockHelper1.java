package main.com.jse.lect11;

public class DeadlockHelper1 extends Thread{
    @Override
   synchronized public void run(){
        synchronized(ThreadDeadLock.RESOURCE1){
            System.out.println("Thread1::Inside first sync Block: Holding Lock1");
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1::Waiting for Lock2");
            synchronized (ThreadDeadLock.RESOURCE2){
                System.out.println("Thread1::Inside second sync Block: Holding Lock2");
            }
        }
    }
}
