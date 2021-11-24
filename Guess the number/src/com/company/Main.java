package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // Scanner Class
        Scanner scanner = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int) (20
                * Math.random());
        // try's or guesses
        int x = 6;

        int i, guess;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 20."
                        + "Guess the number"
                        + " within 6 try's.");

        // Iterate x try's
        for (i = 0; i < x; i++) {

            System.out.println(
                    "Guess the number:");

            // userInput for guessing
            guess = scanner.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != x - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != x - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == x) {
            System.out.println(
                    "You have exhausted"
                            + " x try's.");

            System.out.println(
                    "The number was " + number);
        }
    }

}
