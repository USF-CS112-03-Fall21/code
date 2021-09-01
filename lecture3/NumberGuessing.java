import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	
	public static void guessNumber() {
		Random rand = new Random();
		int num = rand.nextInt();

		System.out.println("Guess a number: ");
		Scanner sc = new Scanner(System.in);
		int userGuess = sc.nextInt();

		if (num == userGuess)
			System.out.println("You guessed right");
		else
			System.out.println("Sorry, wrong guess");

	}

	public static void main(String[] args) {
		guessNumber();
		
	}
}