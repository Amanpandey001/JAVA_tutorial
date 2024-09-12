package com.aman;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //to format doc, use shift alt f
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Minimum Limit of Number u wanna display: ");
        int m = input.nextInt();
        System.out.print("Enter the maximum limit of number u wanna display: ");
        int n = input.nextInt();

        if (m < n) {
            System.out.println("Here is Your Numbers: ");
            for (; m <= n; m++) {
                System.out.println(m);
            }
        } else {
            System.out.println("Minimum limit is greater than Maximum limit hence ARE U A BOZO!!");
        }

    }
}
