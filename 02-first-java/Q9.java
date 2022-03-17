package com.introduction;
import java.util.Scanner;

public class Q9 {
    //To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the interval to find Armstrong numbers in between : ");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            int num = i;
            int sum = 0;

            while(num > 0){
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }

    }
}
