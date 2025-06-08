Write a Java program that uses method overloading to find the maximum of two numbers. 
Overload the max() method to work with: 
Two integers. b) Two floating-point numbers .c) Two strings (compare based on lexicographical 
order).  The program should print the maximum of each pair of values

import java.util.*;

public class Maxfinder {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public float max(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public String max(String a, String b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        Maxfinder sc = new Maxfinder();
        System.out.println("max of integer" + sc.max(2, 3));
        System.out.println("max of float" + sc.max(2.6f, 3.8f));
        System.out.println("max of String" + sc.max("apple", "banana"));

    }
}
