package com.introduction;
import java.util.Scanner;

public class Q4 {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double firstNumber = in.nextDouble();
        System.out.print("Enter the second number : ");
        double secondNumber = in.nextDouble();
        System.out.print("Enter the operator (+, -, *, /) : ");
        String operator = in.next();
        double result = 0;
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operator.equals("/")){
            result = firstNumber / secondNumber;
        }
        System.out.println("The result is " + result);
    }
}
