import java.util.Random;
import java.util.Scanner;

Random random = new Random();
int randomNumber = random.nextInt(100) + 1;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your guess: ");
int userGuess = scanner.nextInt();

if (userGuess == randomNumber) {
    System.out.println("Congratulations! Your guess is correct.");
} else if (userGuess < randomNumber) {
    System.out.println("Too low. Try again.");
} else {
    System.out.println("Too high. Try again.");
}

boolean guessedCorrectly = false;
int attempts = 0;

while (!guessedCorrectly) {
    System.out.print("Enter your guess: ");
    int userGuess = scanner.nextInt();
    attempts++;

    if (userGuess == randomNumber) {
        guessedCorrectly = true;
        System.out.println("Congratulations! Your guess is correct.");
    } else if (userGuess < randomNumber) {
        System.out.println("Too low. Try again.");
    } else {
        System.out.println("Too high. Try again.");
    }
}

int maxAttempts = 5;
int attempts = 0;

while (!guessedCorrectly && attempts < maxAttempts) {
    // ...
}

if (attempts == maxAttempts) {
    System.out.println("Sorry, you've reached the maximum number of attempts.");
}

boolean playAgain = true;

while (playAgain) {
    // Generate a new random number
    // Reset the attempts counter

    // Play the game

    System.out.print("Do you want to play again? (yes/no): ");
    String playAgainInput = scanner.next();

    if (playAgainInput.equalsIgnoreCase("no")) {
        playAgain = false;
    }
}

int score = 0;
-

