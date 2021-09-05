/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 03
 *  Copyright 2021 Danny Yu
 */

// Create a program that prompts the user for a quote and author, then prints the quote and author

import java.util.Scanner;

public class Solution03
{

    /*
        prompts user for quote
            user enters quote
        prompts user for author of quote
            user enters author of quote
        prints quote and the author of said quote
     */

    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote?\n") ;
        String quote = input.nextLine();
        System.out.print("Who says that quote?\n");
        String author = input.nextLine();
        System.out.println(author + " says, " + "\"" + quote+ "\"");
    }
}
