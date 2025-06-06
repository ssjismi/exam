import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class Filee {
    public static void main(String[] args) throws IOException {
        RandomAccessFile n1 = new RandomAccessFile("number.txt", "rw");
        for (int i = 1; i <= 100; i++) {
            n1.writeBytes(i + "\n");
        }
        n1.close();
        RandomAccessFile n2 = new RandomAccessFile("number.txt", "r");
        String line;
        System.out.println("Even numbers:");
        while ((line = n2.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            if (num % 2 == 0) {
                System.out.println("Even:" + num + "\n");
            }
        }
        n2.close();
        RandomAccessFile n3 = new RandomAccessFile("number.txt", "r");
        System.out.println("odd numbers:");
        while ((line = n3.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            if (num % 2 != 0) {
                System.out.println("Odd:" + num + "\n");
            }
        }
        n3.close();
        RandomAccessFile n4 = new RandomAccessFile("number.txt", "r");
        System.out.println("prime numbers:");
        int flag;
        while ((line = n4.readLine()) != null) {
            int num = Integer.parseInt(line.trim());
            for (int j = 2; j < num; j++) {
                flag = 0;
                for (int i = 2; i <= j / 2; i++) {
                    if (j % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.println("prime no:" + j);

            }
        }
        n4.close();

    }
}