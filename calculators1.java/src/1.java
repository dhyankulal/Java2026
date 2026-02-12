import java.util.Random;
import java.util.Scanner;

public class 1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        int numberOfGuesses = 0;
        int guess;
        boolean hasGuessedCorrectly = false;
        System.out.println("welcome to the Number guessing game");
        System.out.println("I have generated a number between 1 and 100.Try to guess it!");
        while (!hasGuessedCorrectly){
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if(guess < randomNumber){
                System.out.println("too low try again.");
            }else if(guess > randomNumber){
                System.out.println("too high try again.");
            }else {
                hasGuessedCorrectly = true;
                System.out.println("congratulations! You guessed the number in "+numberOfGuesses+"guesses.");
            }

        }
        scanner.close();
    }
}