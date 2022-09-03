package com.Functions.Assignments;

import java.util.Scanner;

public class AreaPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float r = in.nextFloat();
        AreaPeri(r);

    }
       static void AreaPeri(float r) {
       float area = 3.14f * r * r;
       float peri = 6.28f * r;
       System.out.println("The area of circle is: " + area + " And the circumference is: " + peri);
    }
}
