package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Intro to User
        System.out.println("Watch Out! You've Been teleported to Land Of Dragons!");
        System.out.println("In front of you are two cave dwellings.");

        // User Choices
        System.out.println("In one dwelling, the dragon is friendly and"
                + "will carry you on his back in glory with treasure.");
        System.out.println("The other dragon would like to be his dinner or snack"
                + "And will eat you on site.");
        System.out.println("Which dwelling will you go to? 1 or 2");

        //Array options
        String option [] = {"Exit Game","Super Dragon", "Ugly Dragon"};

        Scanner userInput = new Scanner(System.in);

        int input = userInput.nextInt();

        // if and output of game
        if (input == 1) {
            System.out.println("You've chosen the super dragon. Whoop! Whoop!"
                    +"You get the treasure and a ride!");
        }
        else if(input == 2) {
            System.out.println("You have chosen to be the dragons dinner! YOU ARE DEAD" );
        }
        else {
            System.out.println("Exit" );
        }
    }
}
