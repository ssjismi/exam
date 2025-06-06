import java.util.*;
import java.util.concurrent.ThreadFactory;

class Fibo extends Thread {
    public void run() {
        int n, c, a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of fibonacci");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("fibonacii" + a + "\n" + b);
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

class Multi extends Thread {
    public void run() {
        System.out.println("factors of 25000");
        for (int i = 1; i <= 25000; i++) {
            if (25000 % i == 0) {
                System.out.println(i);
            }
        }
    }
}

class Mutiple {
    public static void main(String args[]) throws Exception {
        Fibo n1 = new Fibo();
        Multi n2 = new Multi();
        n1.start();
        n2.start();
    }
}