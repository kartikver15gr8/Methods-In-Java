package com.Functions.Assignments;

import java.util.Scanner;

public class SUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        sum(a,b);
    }

    private static void sum(int a, int b) {
        int sum = a+b;
        System.out.println("The sum of a & b is:"+sum);
    }
}
