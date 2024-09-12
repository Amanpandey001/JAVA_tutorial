package com.aman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter A Fruit's Name: ");
        String fruit=input.next().toLowerCase();

        // use .equals instead of == in comparison of Strings cuz, == will give true only if 2 different variables are pointing at the same data, if they are pointing at 2 different data that has same name then it may give false, but we want to compare only the string not the object os we use .equals as it only compares string

        //Old Style switch case
        switch (fruit) {
            case "mango":
                System.out.println("Mango is Yellow And Yummy");
                break;
            case "apple":
                System.out.println("Apple is Red and Keeps Da Doc Away!");
                break;
            case "banana":
                System.out.println("Its yellow and good too, but mango better imo");
                break;
            default:
                System.out.println("This Fruit is Not Registered...");
                break;
        }

        //new style switch case
        switch (fruit) {
            case "mango" -> System.out.println("Mango is Yellow And Yummy");
            case "apple" -> System.out.println("Apple is Red and Keeps Da Doc Away!");
            case "banana" -> System.out.println("Its yellow and good too, but mango better imo");
            default -> System.out.println("This Fruit is Not Registered...");
        }

        //Both Style Works the same...
        System.out.print("Enter a day to find whether its a week day of week end: ");
        int day=input.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay!!");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        //OR

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay!!");
            case 6, 7 -> System.out.println("Weekend");
        }

        //both are same thing.....
    }
}
