package com.Functions.Assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Integer you want to check as 'Even' of 'Odd':");
        int integer = in.nextInt();
        EvenOddCheck(integer);
    }

    static void EvenOddCheck(int a) {
        if (a % 2 == 0) {
            System.out.println("The entered integer is even");
        } else {
            System.out.println("The entered integer is odd");
        }
    }
}
