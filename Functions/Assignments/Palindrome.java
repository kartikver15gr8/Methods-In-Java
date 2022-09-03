package com.Functions.Assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer you want to check as palindrome or not:");
        int n = in.nextInt();

        isPalindrome(n);
    }

    static void isPalindrome(int n) {
        String original = String.valueOf(n);
        String pal = "";
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            String c = String.valueOf(rem);
            pal = pal +c;
        }
        if (pal.equals(original)) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
