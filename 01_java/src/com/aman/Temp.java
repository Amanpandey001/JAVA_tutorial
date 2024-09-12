package com.aman;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Pls enter a Temperature in Celsius: ");
        double tempc=sc.nextDouble();
        double formula=(tempc*9/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+formula);
    }
}
