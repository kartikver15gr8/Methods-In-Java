package com.Functions.Assignments;

import java.util.Scanner;

public class SumUptoNIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = in.nextInt();
        int ans = SumToN(n);
        System.out.println(ans);
    }

    static int SumToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }return sum;
    }
}
