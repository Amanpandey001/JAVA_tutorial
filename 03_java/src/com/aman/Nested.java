package com.aman;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Employee ID: ");
        int emp_id=input.nextInt();
        System.out.print("Enter a department: ");
        String department=input.next();

        switch (emp_id) {
            case 1:
                System.out.println("Aman Pandey");
                break;
            case 2:
                System.out.println("Ashutosh Pandey");
                break;
            case 3:
                System.out.println("Aman Pandey Once Again!!");
                switch (department) {
                    case "IT":
                        System.out.println("IT department!");
                        break;
                    case "Advertisement":
                        System.out.println("Ad department!");
                        break;
                }
                break;
        }

        //OR

        switch (emp_id) {
            case 1 -> System.out.println("Aman Pandey");
            case 2 -> System.out.println("Ashutosh Pandey");
            case 3 -> {
                System.out.println("Aman Pandey Once Again!!");
                switch (department) {
                    case "IT" -> System.out.println("IT department!");
                    case "Advertisement" -> System.out.println("Ad department!");
                }
            }
        }

        //BOTH ARE SAME

    }
}
