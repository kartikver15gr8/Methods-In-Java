package com.Functions.Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to get the factorial of:");
        int n = in.nextInt();
        int fac = factorial(n);
        System.out.println("The factorial of " + n + " is " + fac);
    }

    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <=n ; i++) {
            fact = fact*i;
        }return fact;
    }
}
