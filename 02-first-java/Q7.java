package com.introduction;
import java.util.Scanner;

public class Q7 {
    //To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c , i;
        System.out.print(a + " " + b);

        for (i = 2; i < n ; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
