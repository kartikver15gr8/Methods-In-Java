package com.Functions.Assignments;

import java.util.Scanner;

public class CheckForPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = in.nextInt();
        System.out.println("Enter the value of b:");
        int b = in.nextInt();
        System.out.println("Enter the value of c:");
        int c = in.nextInt();

        boolean ans = isPythagoreanTriplet(a, b, c);
        System.out.println(ans);
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int sq_a = a * a;
        int sq_b = b * b;
        int sq_c = c * c;
        if (sq_a == sq_b + sq_c) {
            return true;
        }
        if (sq_b == sq_a + sq_c) {
            return true;
        }
        return sq_c == sq_b + sq_a;
    }


}
