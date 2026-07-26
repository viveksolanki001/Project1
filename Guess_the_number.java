import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int maxAttempts = 7;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I picked a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts && !guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessed = true;
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        if (!guessed) {
            System.out.println("Sorry! The number was " + targetNumber + ".");
        }

        scanner.close();
    }
}
