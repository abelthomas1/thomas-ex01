/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Abel Thomas
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args){
        /*
        print a question asking user for name
        prompt user for input
        print statement using user input
         */

        Scanner input = new Scanner (System.in);
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
