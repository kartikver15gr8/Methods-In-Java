package com.Functions.Assignments;

import java.util.Scanner;

public class MarksAndGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        int marks = in.nextInt();

        String ans = grades(marks);
        System.out.println("The respective grade of student is: "+ans);
    }

    static String grades(int marks) {
        String grade = "a";
        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        }if (marks >= 81 && marks <= 90) {
            grade = "AB";
        }if (marks >= 71 && marks <= 80) {
            grade = "BB";
        }if (marks >= 61 && marks <= 70) {
            grade = "BC";
        }if (marks >= 51 && marks <= 60) {
            grade = "CD";
        }if (marks >= 41 && marks <= 50) {
            grade = "DD";
        }if (marks<=40) {
            grade = "Fail";
        }return grade;
    }
}
