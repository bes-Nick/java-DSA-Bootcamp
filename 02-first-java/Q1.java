package com.introduction;
import java.util.Scanner;

public class Q1 {
    //Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        System.out.print("Enter an Integer number : ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Entered number is Even");
        } else {
            System.out.println("Entered number is Odd");
        }
    }
}
