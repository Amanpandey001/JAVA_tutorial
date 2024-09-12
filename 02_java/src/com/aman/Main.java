package com.aman;

public class Main {
    public static void main(String[] args) {
        int salary=25000;
        //if-else statement

        /*
        if (salary>10000) {
            System.out.println("Here is Your Bonus Of 2000!");
            salary = salary + 2000;
        }else {
            System.out.println("Here is Your salary of 3000!");
            salary = salary + 3000;
        }
        */


        //multiple if-else statement
        if (salary>5000 && salary<=10000){
            salary+=1000;
            System.out.println("You have 1000 bonus "+salary);
        } else if (salary>10000) {
            salary+=2000;
            System.out.println("You have 2000 bonus "+salary);
        }else {
            System.out.println("You get No Bonus!");
        }
    }
}
