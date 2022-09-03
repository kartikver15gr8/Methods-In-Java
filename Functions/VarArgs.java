package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // VarArgs or variable length arguments are just functions that take variable arguments
        fun(1, 2, 8, 7, 9, 6, 5, 8, 7, 4, 5, 6, 9);
        multiple(5,8,"Make sense","So on and so forth");
    }

    static void multiple(int a, int b, String ...v){
        System.out.print(" "+a);
        System.out.print(" "+b);
        System.out.print(Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
