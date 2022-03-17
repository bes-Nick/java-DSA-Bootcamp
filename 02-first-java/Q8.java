package com.introduction;
import java.util.Scanner;

public class Q8 {
    //To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = in.next();

        String rev = "";

        int len = str.length();

        for (int i = len - 1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is palindrome String");
        }
        else {
            System.out.println(str + " is not palindrome String");
        }
    }
}
