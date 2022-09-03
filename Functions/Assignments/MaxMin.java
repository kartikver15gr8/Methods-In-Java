package com.Functions.Assignments;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        max(num1,num2,num3);
        min(num1,num2,num3);
    }

    static void min(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min=b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println(min);
    }

    static void max(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max=b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max);
    }
}
