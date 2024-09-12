package com.aman;

public class Primitive {
    public static void main(String[] args) {
        //Primitive Data Types

        //all decimal values are by default a double, so when we have to store them in float, we have to add f at the end of the value, and all numbers are by default int, so when we want to store in long then we have to add L at the end of the values :D

        int rollNo = 60; //4bytes
        char alphabet='A';
        float marks=98.67f; //u need to add f here, 4bytes
        double marks_02=98.9953453534; //8 bytes
        long largeInt = 4997847275353535345L; //8 bytes
        boolean human=true;
        System.out.println(rollNo + " " + alphabet + " " + marks + " " + marks_02 + " " + " " + largeInt + " " + human + " " + !human);

        //Non-Primitive Data type
        String name="Aman";
        System.out.println(name);
        //the data type that u cannot break into other data types is known as primitive data types, u can break a string i.e. Aman into character data types 'A' 'm' 'a' 'n' but not integer or char


    }
}
