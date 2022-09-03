package com.Functions;

import java.util.Arrays;

public class PassingExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 9, 6, 6, 4, 9};
        greet(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void greet(int[] num) {
        num[0] = 99;
    }
}
