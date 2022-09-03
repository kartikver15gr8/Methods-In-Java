package com.Functions;

public class Shadowing {
    static int x = 97;   // We assigned int x as static because we will be using 'x' in the below main function which is 'static'
    static int y = 98;   // This will be shadowed in line '11' as we re-declared 'x' and 'y' in line 9
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        int x = 103, y = 111;   // Here we again initialized 'x' and 'y', hence the value of 'x' and 'y' that will be printed out by the below statements will be the value that we just declared.
        System.out.println(x+" This value of x is only available in the scope of it's declaration");  // This will print 103
        System.out.println(y+" This value of y is only available in the scope of it's declaration");  // This will print 111

        fun();     // We called the function 'fun'
    }

    static void fun() {
        System.out.println(x);
    }


}
