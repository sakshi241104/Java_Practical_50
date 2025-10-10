//LAb-5 Assignment-2
import java.util.Random;

class TicketBooking {
    int tickets = 20;

    synchronized void book(String name, int num) {
        if (num <= tickets) {
            System.out.println(name + " booked " + num + " tickets.");
            tickets -= num;
            System.out.println("Tickets left: " + tickets);
        } else {
            System.out.println(name + " tried to book " + num + " tickets - Not enough!");
        }
    }
}

class User1 implements Runnable {
    TicketBooking tb; String name;
    User1(TicketBooking t, String n) { tb = t; name = n; }

    public void run() {
        Random r = new Random();
        int n = r.nextInt(5) + 1;
        tb.book(name, n);
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        TicketBooking t = new TicketBooking();
        for (int i = 1; i <= 10; i++) {
            new Thread(new User1(t, "User" + i)).start();
        }
    }
}
