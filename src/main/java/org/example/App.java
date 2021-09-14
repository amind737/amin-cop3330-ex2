/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the input string? ");
        String str=input.nextLine();
        int count=0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }
        System.out.println(""+str+" has "+count+" chatacters.");

    }
}
