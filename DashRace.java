// Lab-5 Assignment-1
import java.util.Random;

class Runner1 extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 10; i <= 100; i += 10) {
            System.out.println("Runner Bolt: " + i + "m");
            try { Thread.sleep(r.nextInt(151) + 50); } catch (Exception e) {}
        }
        System.out.println("Runner Bolt: Finished!");
    }
}

class Runner2 implements Runnable {
    String name;
    Runner2(String n) { name = n; }

    public void run() {
        Random r = new Random();
        for (int i = 10; i <= 100; i += 10) {
            System.out.println(name + ": " + i + "m");
            try { Thread.sleep(r.nextInt(151) + 50); } catch (Exception e) {}
        }
        System.out.println(name + ": Finished!");
    }
}

public class DashRace {
    public static void main(String[] args) {
        Thread t1 = new Runner1();
        Thread t2 = new Thread(new Runner2("Runner Tyson"));
        Thread t3 = new Thread(new Runner2("Runner Blake"));
        t1.start(); t2.start(); t3.start();
    }
}
