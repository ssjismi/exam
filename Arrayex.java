public class Arrayex {
    public static void main(String args[]) {
        int num[] = { 3, 8, 14, 17, 15, 10 };
        System.out.println("even numbers in array are:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }
        System.out.println("try to access out of boundary:");
        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error" + e);
        }
    }

}
