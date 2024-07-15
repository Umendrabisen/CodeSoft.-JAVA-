
import java.util.Random;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please choose a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("It's greater than " + guess + ".");
            } else if (guess > numberToGuess) {
                System.out.println("It's less than " + guess + ".");
            } else {
                hasWon = true;
                System.out.println("Correct! You've guessed the right number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}