/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 03
 *  Copyright 2021 Danny Yu
 */

// Create a program that prompts the user for a quote and author, then prints the quote and author

import java.util.Scanner;

public class Solution03
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        // variable to get input from user
        System.out.print("What is the quote?\n") ;
        // prompt to ask user for quote
        String quote = input.nextLine();
        // reads quote input from user
        System.out.print("Who says that quote?\n");
        // prompt to ask user for author of quote
        String author = input.nextLine();
        // reads author input from user
        System.out.println(author + " says, " + "\"" + quote+ "\"");
        //prints quote and author
    }
}
