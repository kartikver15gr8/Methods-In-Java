package com.Functions.Assignments;

import java.util.Scanner;

public class Eligibility_Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();
        EligibilityTest(age);
    }

    private static void EligibilityTest(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote:");
        } else {
            System.out.println("You are not eligible to vote, as you are underage");
        }
    }
}
