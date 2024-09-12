package com.aman.questions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // 1234 -> 4321
        System.out.print("Enter a number that u want to reverse: ");
        int num= input.nextInt();
        int ans=0;
        while(num>0){
            int rem=num%10; //last digit ko store karta he rem me
            num/=10; //last digit num se hata deta he
            ans=ans*10+rem; //jo ans he usme 10 ko multiply karke rem ko add karta he for eg: 1234, num=0 he to ye 0*10+4 = 4, then 4*10+3=43, then 43*10+2=432,then 432*10+1=4321 and boom, your reversed num is ready....
        }
        System.out.println("Your reversed Number is: "+ans);
    }
}
