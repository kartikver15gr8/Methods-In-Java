package com.Functions.Assignments;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer you want to check as prime or not!");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

        /*The below for loop uses our Function/Method
        to print all the prime numbers between two numbers*/

//        for (int i = 10; i < 100; i++) {
//            if (isPrime(i)) {
//                System.out.println(i+" ");
//            }
//        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c*c<n){
            if (n % c == 0) {
                return false;
            }c++;
        }if (c*c>n){
            return true;
        }return false;
    }
}


