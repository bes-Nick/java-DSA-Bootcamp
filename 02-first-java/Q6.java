package com.introduction;
import java.util.Scanner;

public class Q6 {
    //Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value in INR : ");
        double inr = in.nextInt();
        double usd = inr * 0.013;
        System.out.println("The value in USD : " + usd);
    }
}
