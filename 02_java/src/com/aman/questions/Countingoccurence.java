package com.aman.questions;

import java.util.Scanner;

public class Countingoccurence {
    public static void main(String[] args) {
        // n%10 -> will give last digit of a number
        Scanner input=new Scanner(System.in);

        System.out.print("Enter numbers to search for repeated number: ");
        long n=input.nextLong();

        System.out.print("Enter the number of which u want to search how many times it appears: ");
        long m= input.nextLong();
        int count=0;
        while(n>0){
            long rem=n%10;
            if(rem==m){
                count++;
            }
            n=n/10;
        }
        System.out.println("Count is: "+count);
    }
}
