package com.aman;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Your Roll No: ");
//        int rollNo = input.nextInt();
//        System.out.println("Your Roll No Is: " + rollNo);

        String name=input.nextLine();
        System.out.println(name);
        float marks=input.nextFloat();
        System.out.println(marks);
    }
}
