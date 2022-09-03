package com.Functions;

import java.sql.Statement;
import java.util.Scanner;

public class FunctionsWithArguments {
    public static void main(String[] args) {
        int Addition = sum(10, 50);   // Here we called the function and input the arguments which was given to the function when we was initializing it.
        System.out.println("The sum of a and b is: "+Addition);
        String Say = greeting("Kartikey Verma");
        System.out.println(Say);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The value of first Integer:");
        int p = in.nextInt();
        System.out.println("Enter The value of second Integer:");
        int q = in.nextInt();
        String Swaps = swap(p,q);
        System.out.println("The result after swapping is: "+Swaps);
    }

    /*In functions with arguments we provide parameters or the arguments
      to the function while initializing it*/
    static int sum(int a, int b) {  // This will return the sum of a and b
        int sum = a+b;
        return sum;
    }
    // Another example of the function with arguments can be:
    static String swap(int n1,int n2) { // This will swap the two input integers
        int c = n1;
        n1 = n2;
        n2 = c;
        return n1+" "+n2;
    }
    // Another example of the function with arguments can be:
    static String greeting(String name) {  // This will print a greeting message
        String greet = "Welcome to the Next Level! ";
        String gen = ". You're such a Genius!";
        String result = greet+name+gen;
        return result;
    }
}
