// Lab-5 Assignment-3
import java.util.*;

class Counter {
    Queue<Integer> q = new LinkedList<>();
    int limit = 5;
    int order = 1;

    synchronized void place() throws Exception {
        while (q.size() == limit) wait();
        q.add(order);
        System.out.println("Chef placed Order " + order++);
        notifyAll();
    }

    synchronized void serve() throws Exception {
        while (q.isEmpty()) wait();
        int x = q.poll();
        System.out.println("Waiter served Order " + x);
        notifyAll();
    }
}

class Chef implements Runnable {
    Counter c;
    Chef(Counter c) { this.c = c; }
    public void run() {
        try {
            while (true) { c.place(); Thread.sleep(500); }
        } catch (Exception e) {}
    }
}

class Waiter implements Runnable {
    Counter c;
    Waiter(Counter c) { this.c = c; }
    public void run() {
        try {
            while (true) { c.serve(); Thread.sleep(800); }
        } catch (Exception e) {}
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Counter c = new Counter();
        new Thread(new Chef(c)).start();
        new Thread(new Waiter(c)).start();
    }
}
