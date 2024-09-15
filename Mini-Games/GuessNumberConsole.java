/*Initialize  */
import java.util.Random;
import java.util.Scanner;

/**
 * Started? Yessir ' github.com/Watthayanuraks/ '
 */
public class GuessNumberConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int numberOfTries = 0;
        int userGuess = 0;

        System.out.println("Tebak Nomor 🧐");
        System.out.println("I'm thinking of a number between " + min + " and " + max + ". Can to try it?");

        while (userGuess != numberToGuess) {
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("========================================================");
                System.out.println("Too low || almost ! Try again. 🤓");
                System.out.println("========================================================");
            } else if (userGuess > numberToGuess) {
                System.out.println("========================================================");
                System.out.println("Too high ||  almost ! Try again.🤓");
                System.out.println("========================================================");
            } else {
                System.out.println("========================================================");
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries 😎");
                System.out.println("========================================================");
            }
        }

        scanner.close();
    }
}
