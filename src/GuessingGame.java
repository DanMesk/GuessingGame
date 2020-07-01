import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    // The types that allow for the game to function and other variables to be called for
    public static int numGen;
    public static int userGuess;
    public static double totalGames;
    public static double numberOfGuesses;
    public static int bestMin = Integer.MAX_VALUE;

    public static Scanner input = new Scanner(System.in);

    // The methods for the program
    public static void main(String[] args)
    {
        gameIntro();
        Game();
    }
    // intro for the game and how the game is played
    public static void gameIntro()
    {
        System.out.printf("This program allows you to play a guessing game.");
        System.out.printf("%nI will think of a number between 1 and");
        System.out.printf("%n100 and will allow you to guess until");
        System.out.printf("%nyou get it. For each guess, I will tell you");
        System.out.printf("%nwhether the right answer is higher or lower");
        System.out.printf("%nthan your guess.%n");
    }

    // the method for the game (main code)
    public static void Game()
    {
        // counts how many games played
        totalGames++;

        Random rand = new Random();
        numGen = rand.nextInt(5);
        boolean Play = false;

        // counts the number of tries
        int numTries = 0;

        // The core part of the game
        do {
            System.out.print("Guess a number between 1 and 5: ");
            userGuess = input.nextInt();
            numTries++;

            if (userGuess == numGen)
            {
                Play = true;

            } else if (userGuess > numGen)
            {
                System.out.println("Its lower");
            } else if (userGuess < numGen)
            {
                System.out.println("Its higher");
            }
            numberOfGuesses++;

        } while (Play == false);

        if (numberOfGuesses < bestMin)
        {
            bestMin = (int) numberOfGuesses;
        }
        System.out.println("You win! It took you " + numTries + " tries");
        // calls the PlayAgain method
        PlayAgain();
    }
    // this method prompts the user if they want to play again
    public static void PlayAgain()
    {
        String answer;
        System.out.print("Would you like to play again y/n? ");
        answer = input.next();

        switch (answer)
        {
            case "y": {
                Game();
                break;
            }
            case "n": {
                Results();
                break;
            }
            default:
                break;
        }
    }

    // this method will display the results of the game played
    public static void Results()
    {
        System.out.println("Total games played: " + totalGames);
        System.out.println("Total guesses: " + numberOfGuesses);
        System.out.printf("Average guesses per game: %,.2f%n", numberOfGuesses/totalGames);
        System.out.println("Best game: " + bestMin);
    }
}
