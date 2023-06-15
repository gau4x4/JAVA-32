package main.com.jse.lect11;

public class TicketBookingHelper implements Runnable{
    private static int MAX_TICKETS = 400;
    private int bookingId;

    public TicketBookingHelper(int bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public void run() {
    synchronized (new Object()) {
            if (MAX_TICKETS>0) {
                System.out.println("Booking Details:" + bookingId +" With Thread "+Thread.currentThread().getName() +": Booked. Remaining Pool:: " + (--MAX_TICKETS));
            } else {
                System.out.println("Out of Tickets");
            }
        }
    }
}
