package com.introduction;
import java.util.Scanner;

public class Q2 {
    //Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String userName = in.nextLine();
        System.out.println("Hello, " + userName);

    }
}
