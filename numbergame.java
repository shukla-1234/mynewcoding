
import java.util.Scanner;

public class NUMBERGAME {


	public static void
	guessingNumberGame()
	{
		
		Scanner obj = new Scanner(System.in);

		int number = 1 + (int)(100* Math.random());

	          int n = 5;

		  int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 5 trials.");


		for (i = 0; i < n; i++) {

			System.out.println("Guess the number:");

			
			guess = obj.nextInt();

		
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess&& i != n - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess&& i != n - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == n) {
			System.out.println("You have exhausted"+ " n trials.");

			System.out.println("The number was " + number);
		}
	}
                   public static void
                      main(String arg[])
    {
 
        
        guessingNumberGame();


	}
}
