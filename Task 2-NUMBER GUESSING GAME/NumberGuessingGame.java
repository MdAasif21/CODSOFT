import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        while (true) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("\nI've generated a number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! Your guess is correct!");
                    score += (maxAttempts - attempt + 1);

                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }

                if (attempt == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}