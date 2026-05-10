import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to Guess The Number!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?\n");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("📉 Too high! Try again.\n");
            } else if (guess < number) {
                System.out.println("📈 Too low! Try again.\n");
            } else {
                System.out.println("\n🎉 Correct!");
                System.out.println("You guessed the number in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
