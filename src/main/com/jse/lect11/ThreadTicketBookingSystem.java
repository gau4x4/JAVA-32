package main.com.jse.lect11;

import java.util.concurrent.*;

public class ThreadTicketBookingSystem {
    public static void main(String[] args){
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {
            es.execute(new TicketBookingHelper(i));
        }
        es.shutdown();
    }
}
