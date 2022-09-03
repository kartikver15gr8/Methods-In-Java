package com.Functions;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(97);
        fun("Hello");
        int add_two = sum(1, 5, 4);
        System.out.println(add_two);
        int add_three = sum(2, 5);
        System.out.println(add_three);
    }

    static int sum(int a, int b, int c) {
        System.out.print("The sum of a, b and c is: ");
        return a + b + c;
    }
    static int sum(int a, int b) {
        System.out.print("The sum of a and b is: ");
        return a + b;
    }
    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

}
