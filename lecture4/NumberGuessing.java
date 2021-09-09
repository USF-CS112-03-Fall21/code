import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	
	public static void guessNumber() {
		Random rand = new Random();
		int num = rand.nextInt(10);

		System.out.println("Guess a number: ");
		Scanner sc = new Scanner(System.in);
		int userGuess = sc.nextInt();

		int counter = 0;
		while ((counter <= 5) && (userGuess != num)) {

			System.out.println("Guess a number again: ");
			userGuess = sc.nextInt();

			counter = counter + 1;
		}
		if (userGuess == num)
			System.out.println("You guessed right");
		else
			System.out.println("Too bad, wrong guesses.");
		
	}

	public static void main(String[] args) {
		guessNumber();
		
	}
}