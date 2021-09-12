/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;
import java.lang.Math;

public class App {

    public static void main(String[] args) {

        int amtYears, compound;
        double invest;

        Scanner s = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        float p = s.nextFloat();
        System.out.print("What is the rate? ");
        float interest = s.nextFloat();

        if (interest < 1) {
            System.out.print("Enter a valid percent value.");
            interest = s.nextFloat();
        }

        System.out.print("What is the number of years? ");
        amtYears = s.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = s.nextInt();
        interest /= 100;
        invest  = p * Math.pow((1 + interest / compound),(compound * amtYears));

        System.out.printf("$%.1f invested at %.1f%% for %d years compounded %d times per year is $%.2f.", p, (interest*100), amtYears, compound, invest);
    }
}