import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int minRange =1;
		int maxRange =100;
		int maxAttemt =5;
		int score =0;
		
		boolean playAgain = true;
		while (playAgain){
			int generateNumber = random.nextInt(maxRange - minRange + 1) + minRange;
			int attempt =0;
			boolean guessedCorrectly = false;
			
			System.out.println("Welcome to guess number game: ");
			System.out.println("I have generated a number between " + minRange + " and " + maxRange + " . Guess It! ");
			System.out.println("You have " + maxAttemt + "Attempts: ");
			
			while(attempt < maxAttemt && !guessedCorrectly){
				System.out.println("Enter your guess: ");
				int userGuess = scanner.nextInt();
				scanner.nextInt();
				
				attempt++;
				if(userGuess == generateNumber){
					System.out.println("Congratulations! You guessed the number " + generateNumber+" Correctly! ");
					guessedCorrectly=true;
					score += maxAttemt - attempt +1;
					
				}else if(userGuess < generateNumber){
					System.out.println("To low! Try again. ");
				}else{
					System.out.println("To high! Try again. ");
				}
				
			}
			if(!guessedCorrectly){
				System.out.println("Sorry, you've used all your attempts. The number was: " + generateNumber);
			}
			System.out.println("Your current score: "+ score);
			System.out.println("Do you want to play again? (Yes/no): ");
			String playAgainResponse = scanner.nextLine().toLowerCase();
			
			if(!playAgainResponse.equals("yes")){
				playAgain = false;
				System.out.println("Thanks for playing Guess the Number! ");
			}

		}
		scanner.close();
	}
	
}