import java.util.Scanner;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Student extends Person {
    int total;
    String sname;

    Student(int age, String name, int total, String sname) {
        super(age, sname);
        this.total = total;
        this.sname = sname;
    }

    void dis() {
        System.out.println("age:" + age + "name" + name + "total" + total + "sname:" + sname);
    }
}

class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of students:");
        int n = sc.nextInt();
        sc.nextLine();
        Student arr[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter your name:");
            String name = sc.nextLine();
            System.out.println("enter your age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("enter your school name:");
            String sname = sc.nextLine();
            System.out.println("enter total:");
            int total = sc.nextInt();
            sc.nextLine();
            arr[i] = new Student(age, name, total, sname);
        }
        for (int i = 0; i < n; i++) {
            arr[i].dis();

        }
    }
}