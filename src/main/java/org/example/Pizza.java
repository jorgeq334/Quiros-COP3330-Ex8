package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Pizza
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How many people?");
        Integer people= input.nextInt();
        System.out.println( "How many pizzas do you have?" );
        Integer pizza= input.nextInt();
        System.out.println( "How many slices per pizza?" );
        Integer slices= input.nextInt();
        Integer totalSlices= slices * pizza;
        Integer sliceper= totalSlices / people;
        Integer left= totalSlices % people;
        System.out.println(people + " people "+ pizza + " pizzas " + "(" + totalSlices + " slices)");
        System.out.println("Each person gets "+ sliceper + " pieces of pizza.");
        System.out.println("There are " + left + " leftover pieces.");


    }
}
