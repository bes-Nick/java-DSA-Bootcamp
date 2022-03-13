package com.introduction;
import java.util.Scanner;

public class Q3 {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
    double principle, rate, time, simpleInterest;
    Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        principle = in.nextDouble();
        System.out.print("Enter the Rate : ");
        rate = in.nextDouble();
        System.out.print("Enter the Time : ");
        time = in.nextDouble();
        simpleInterest = principle * time * rate / 100;
        System.out.println("Simple interest is : " + simpleInterest);
    }
}
