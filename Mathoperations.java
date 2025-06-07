import java.util.*;

class Mathoptions {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Submaths extends Mathoptions {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

class Mathoperations {
    public static void main(String[] args) {
        Submaths s1 = new Submaths();
        System.out.println("add" + s1.add(3, 2));
        System.out.println("add" + s1.add(3.5, 2.8));
        System.out.println("add" + s1.add(3, 2, 2));
        System.out.println("multiply" + s1.multiply(3, 2));
        System.out.println("multiply" + s1.multiply(8.5, 9.1));
    }
}
