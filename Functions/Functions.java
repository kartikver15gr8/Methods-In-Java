package com.Functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        /*We use functions whenever there is a need to perform same task again and again.
        Then in such condition we use functions which are known as methods in java.
        we use them as it facilitates us to use our code again and again for random different values
        without repeating and rewriting the code for different inputs.
        It runs on DRY( Don't Repeat Yourself) principle.*/
        sum();  // function call (we called the function "sum")
        float avg = average();  // function call by initializing it as a local variable (we called the function "average" by initializing it as a local variable name "avg" which is of float datatype)
        System.out.println("The average of n1 and n2 is: "+avg);
        }
    static float average(){     // Here the return type is float as we are returning a float value in the function "average"
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n1:");
        int n1 = in.nextInt();
        System.out.println("Enter the value of n2:");
        int n2 = in.nextInt();
        int sum = n1+n2;
        float avg = sum/2;
        return avg;     // Here we returned the float average value
        /* Note:
        *  nothing after the return statement will get executed in the
        * function*/
    }
    static void sum(){  // Here the return type is void as we are not returning anything in the function "sum"
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of num1:");
        int num1 = in.nextInt();
        System.out.println("Enter the value of num2:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of num1 and num2 is: " + sum);
    }
}
