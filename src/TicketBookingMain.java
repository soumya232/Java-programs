
class TicketBooking {
    int availableSeats;

    TicketBooking(int seats) {
        availableSeats = seats;
    }

    synchronized void bookSeat(int seats) {
        String user = Thread.currentThread().getName();

        if (seats <= availableSeats) {
            availableSeats = availableSeats - seats;

            System.out.println(user + " booked " + seats
                    + " seat(s) successfully");
        } else {
            System.out.println(user
                    + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    TicketBooking booking;

    User1(TicketBooking booking) {
        this.booking = booking;
        setName("User1");
    }

    public void run() {
        booking.bookSeat(1);
    }
}

class User2 extends Thread {
    TicketBooking booking;

    User2(TicketBooking booking) {
        this.booking = booking;
        setName("User2");
    }

    public void run() {
        booking.bookSeat(2);
    }
}

public class TicketBookingMain {
    public static void main(String[] args)
            throws InterruptedException {

        TicketBooking booking = new TicketBooking(2);

        User1 u1 = new User1(booking);
        User2 u2 = new User2(booking);

        u1.start();
        u1.join();

        u2.start();
        u2.join();
    }
}
