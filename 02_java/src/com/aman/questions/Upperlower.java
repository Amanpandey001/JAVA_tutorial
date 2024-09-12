package com.aman.questions;

import java.util.Scanner;

public class Upperlower {
    public static void main(String[] args) {
        //check whether gvn character is uppercase or lowercase

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char alpha=input.next().trim().charAt(0);
        if (alpha>='a' && alpha<='z'){
            System.out.println("Given Character is LowerCase!!!");
        }else {
            System.out.println("Given Character is UpperCase!!!");
        }

        System.out.print("Enter a String: "); //trim removes spaces from input
        String c=input.next().trim();
        System.out.println("Your String: "+c);
        String lowercase=c.toLowerCase();
        System.out.println("Lowercase input: "+lowercase);
    }
}
