import java.util.Scanner;
import java.util.Random;

public class UniqueGuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        displayGameBorder();

        System.out.println("Welcome to the Exciting Number Challenge!");

        while (true) {
            int targetNumber = random.nextInt(100) + 1; 
            int maxAttempts = 12; 
            int attempts = 0;

            System.out.println("Guess the number between 1 - 100");

            while (attempts < maxAttempts) {
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You nailed it!");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println(" Low! Climb higher for success.");
                } else {
                    System.out.println("High! Descend a bit for Success.");
                }

                attempts++;
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (attempts < maxAttempts) {
                System.out.println("You guessed the number in " + attempts + " attempts. Great job!\n");
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + "\n");
            }

            System.out.print("Do you want to take the challenge again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thank you");
                break;
            }
        }
    }

    private static void displayGameBorder() {
        System.out.println("*        THE EXCITING NUMBER CHALLENGE         *");
    }
}
