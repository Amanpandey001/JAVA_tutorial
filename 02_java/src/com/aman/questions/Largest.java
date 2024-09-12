package com.aman.questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //largest number
        Scanner input=new Scanner(System.in);
        int num_1,num_2,num_3;
        System.out.print("Enter Num 1: ");
        num_1=input.nextInt();

        System.out.print("Enter Num 2: ");
        num_2=input.nextInt();

        System.out.print("Enter Num 3: ");
        num_3=input.nextInt();

        if (num_1>num_2 && num_1>num_3){
            System.out.println(num_1+" is the greatest among the gvn nums!!");
        } else if (num_2>num_1 && num_2>num_3) {
            System.out.println(num_2+" is the greatest among the gvn nums!!");
        } else {
            System.out.println(num_3+" is the greatest among the gvn nums!!");
        }

        //OR

        int max=Math.max(Math.max(num_1,num_2),num_3);
        System.out.println(max+" is the greatest among the gvn nums, using Math.max...");
    }
}
