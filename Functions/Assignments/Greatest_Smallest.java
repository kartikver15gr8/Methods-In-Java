package com.Functions.Assignments;

public class Greatest_Smallest {
    public static void main(String[] args) {
        int gre = Greatest(94, 98, 97);
        System.out.println("The greatest integer among a, b and c is: "+gre);
        int sma = Smallest(84, 8588, 4545);
        System.out.println("The smallest integer among a, b and c is: "+sma);
    }
    static int Greatest(int a, int b, int c){
        int max = a;
        if (b > a) {
            max=b;
        } else if (c > a) {
            max = c;
        }
        return max;
    }

    static int Smallest(int a, int b, int c){
        int min = a;
        if (b < a) {
            min=b;
        } else if (c < a) {
            min = c;
        }
        return min;
    }
}
