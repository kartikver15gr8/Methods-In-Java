package com.Functions.Assignments;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        Product(a,b);
    }

    private static void Product(int a, int b) {
        int mul = a*b;
        System.out.println("The multiplication of a & b is:"+mul);
    }
}
