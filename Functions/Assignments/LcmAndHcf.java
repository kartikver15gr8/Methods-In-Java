package com.Functions.Assignments;

import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        LcmHcf(n1, n2);
    }

    static void LcmHcf(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= n1 / 2; i++) {
            for (int j = 1; j <= n2 / 2; j++) {
                if (n1 % i == 0 && n2 % j == 0 && i == j) {
                    gcd = i;
                }
            }
        }
        int lcm = n1 * n2 / gcd;
        System.out.println(lcm);
        System.out.println(gcd);
    }
}
