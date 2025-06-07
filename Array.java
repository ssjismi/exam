import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        System.out.println("enter the numbers of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the numbers of second array:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Sum of array:");
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            int num = c[i];
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        System.out.println("\n\nEven numbers in the resultant array:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nodd numbers in the resultant array:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}