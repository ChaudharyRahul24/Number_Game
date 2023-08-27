package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int prevGuess = -1;
        boolean correctGuess = false;

        System.out.println("Welcome to the Number Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                correctGuess = true;
            } else {
                if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                if (prevGuess != -1) {
                    if (Math.abs(secretNumber - prevGuess) > Math.abs(secretNumber - guess)) {
                        System.out.println("You're getting warmer!");
                    } else {
                        System.out.println("You're getting colder!");
                    }
                }

                prevGuess = guess;
            }
        }
    }
}
