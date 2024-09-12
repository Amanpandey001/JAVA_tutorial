package com.aman;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        //automatic type conversion
         //conditions: 1. both types should be compatible like float and int is compatible, 2. Destination type should be greater than the source type , like float type is greater than int type cuz we can give input as int or float both in float type, but we cannot give float type as input in int type
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        float num=input.nextFloat();
        System.out.println("Num: "+ num);

        //Type Casting

        //int num_2=6.66f; will give error, but u can convert
        int num_2 = (int)(6.66f); //now wont give error
        System.out.println(num_2); //will give 6 as value :)

        //automatic type promotions in expressions
        int a=257;
        byte b=(byte)(a); //max val u can store in byte is 256 btw
        System.out.println(b); //will give output: 1, cuz 257 is more than it can store, so it just divides and gives remainder, like here it does 257 % 256 and hence the answer 1

        byte x=40;
        byte y=50;
        byte z=100;
        int d = (x*y)/z; //here java is automatically promoting byte to int cuz 40*50 is 2000 but byte can only handle value till 256
        System.out.println(d);

//        byte m=50;
//        m=m*2; will give error cuz u cannot assign int to byte and here m*2 is a int and u         cant store it in byte m :D

        int number = 'a';
        System.out.println(number); //will give ASCII value of a :) 97 or smth

        System.out.println("你好"); //java follows unicode principles, i.e. all languages allowed to print :), if cursor white, press insert key

        //Rules for Type Promotion
        System.out.println(5*5.5f); //will give answer in float

        //example
        byte i=42;
        char j='c';
        short k=1024;
        int l=50000;
        float m=5.556f;
        double n=0.324234;
        double result_example = ( m * i ) + ( l / j ) - ( n - k );
        System.out.println(( m * i ) +"|"+ ( l / j ) +"|"+ ( n - k ));
        System.out.println("result is:"+result_example);
    }
}
