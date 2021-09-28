/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

package Exercise33;


import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your question?");
        String question = scan.nextLine();
        String response = "";

        int randomResponse = (int)(Math.random() * 4);

        switch(randomResponse)
        {
            case 0: response = "Yes.";
                break;
            case 1: response = "No.";
                break;
            case 2: response = "Maybe.";
                break;
            case 3: response = "Ask Again Later.";
                break;
        }


        System.out.println();
        System.out.println(response);
    }
}