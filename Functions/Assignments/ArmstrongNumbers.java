package com.Functions.Assignments;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a three digit Integer you want to check whether it is an armstrong number or not!");
//        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);

    /*The below loop uses the 'isArmstrong' method
    * to print all the 3-digit Armstrong numbers*/
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    /*The below Function/Method is made to
    * check whether a 3-digit number is Armstrong number
    * or not!, This method is made to give boolean output */
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int cube = rem*rem*rem;
            n = n/10;
            sum += cube;
        }
        return sum == original;
    }

    /*The below Function/Method is made to
     * check whether a 3-digit number is Armstrong number
     * or not!, This method is made to give void output */

//    static void isArmstrong(int n) {
//        int original = n;
//        int sum = 0;
//        while (n > 0) {
//            int rem = n%10;
//            int cube = rem*rem*rem;
//            sum += cube;
//            n = n/10;
//        }
//        if (sum == original) {
//            System.out.println("Armstrong");
//        } else {
//            System.out.println("Not Armstrong");
//        }
//    }
}
