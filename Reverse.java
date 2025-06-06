import java.util.*;
import java.util.concurrent.ThreadFactory;

class Fibo extends Thread {
    public void run() {
        System.out.println("multiple of 2 and 3");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("multiple" + i);
            }
        }
    }
}

class Multi extends Thread {
    public void run() {
        System.out.println("Even numbers between 100 and 50");
        for (int i = 100; i >= 50; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class Reverse {
    public static void main(String args[]) throws Exception {
        Fibo n1 = new Fibo();
        Multi n2 = new Multi();
        n1.start();
        n2.start();
    }
}
