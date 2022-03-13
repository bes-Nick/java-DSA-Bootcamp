package com.introduction;
import java.util.Scanner;

public class Q5 {
    //Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = in.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The Largest Number = " + firstNumber);
        }
        else if (secondNumber > firstNumber) {
            System.out.println("The Largset Number = " + secondNumber);
        } else {
            System.out.println("Both are equal");
        }
    }
}
