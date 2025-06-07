import Mathop.*;
import java.util.*;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operate c1 = new Operate();
        System.out.println("enter a and b");
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("addition" + c1.add(a, b));
        System.out.println("subtraction" + c1.subtract(a, b));
        System.out.println("multiply" + c1.multiply(a, b));
        System.out.println("divide" + c1.divide(a, b));
    }
}
