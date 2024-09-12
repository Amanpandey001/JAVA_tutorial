package com.aman;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter First Number: ");
        a=input.nextDouble();
        System.out.print("Enter Second Number: ");
        b=input.nextDouble();
        c=a+b;
        System.out.println("Your Sum is: " + c);
    }
}
