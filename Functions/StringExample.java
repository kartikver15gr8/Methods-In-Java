package com.Functions;

public class StringExample {
    public static void main(String[] args) {
    String val = bestBook();
        System.out.println(val);
    }

    static String bestBook() {
        System.out.println("Which is your favorite book?");
        System.out.println("There are a lot of books that I just love, but a book out of those that really empowers me is...");
        String str = "The Courage To Be Disliked!";
        return str;
    }
}
