package com.aman.questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("Enter a valid operator (+,-,/,*,%): ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter Num1: ");
                double num_1 = input.nextDouble();

                System.out.print("Enter Num2: ");
                double num_2 = input.nextDouble();

                if (op == '+') {
                    System.out.println("Addition of the Numbers is: " + (num_1 + num_2));
                } else if (op == '-') {
                    System.out.println("Subtraction of the Numbers is: " + (num_1 - num_2));
                } else if (op == '*') {
                    System.out.println("Multiplication of the Numbers is: " + (num_1 * num_2));
                } else if (op == '/') {
                    if (num_2 != 0) {
                        System.out.println("Division of the Numbers is: " + (num_1 / num_2));
                    }else {
                        System.out.println("Dont divide by 0 man, it gives ∞");
                    }
                } else if (op == '%') {
                    System.out.println("Remainder when diving the two numbers is: " + (num_1 % num_2));
                } else {
                    System.out.println("Enter A valid Integer...");
                }

            } else if (op == 'x' || op == 'X') {
                System.out.println("Program Exited!!");
                check = false;
            } else {
                System.out.println("Invalid operator!!");
                check = false;
            }
        }
    }
}
