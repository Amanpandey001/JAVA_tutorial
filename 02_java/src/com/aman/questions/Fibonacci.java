package com.aman.questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //0 and 1 is first 2 number then sum of previous two numbers is the next number....
        int num_1,num_2,num_n;
        num_1=0;
        num_2=1;
        int count=2;
        System.out.print("Enter a number: ");
        num_n=input.nextInt();
        while (count<=num_n){
            int temp=num_2;
            num_2+=num_1;
            num_1=temp;
            count++;
        }

        System.out.println("The Fibonacci number at the given position is: "+num_2);
    }
}
