import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    // initializing the variables I will be using
    private static int totalGames;
    private static double numberOfGuesses;
    private static int bestNum = Integer.MAX_VALUE;
    // global user input to use for all methods
    private static final Scanner input = new Scanner(System.in);

    // The methods for the program
    public static void main(String[] args)
    {
        gameIntro();
        Game();
    }
    // intro for the game and how the game is played
    private static void gameIntro()
    {
        System.out.print("This program allows you to play a guessing game.");
        System.out.printf("%nI will think of a number between 1 and");
        System.out.printf("%n100 and will allow you to guess until");
        System.out.printf("%nyou get it. For each guess, I will tell you");
        System.out.printf("%nwhether the right answer is higher or lower");
        System.out.printf("%nthan your guess.%n");
    }

    // the method for the game (main code)
    private static void Game()
    {
        // counts how many games played
        totalGames++;

        // generates the number from 0 - 100
        Random rand = new Random();
        int numGen = rand.nextInt(100);

        // counts the number of tries
        int numTries = 0;

        // The core part of the game
        int userGuess;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = input.nextInt();
            numTries++;
            numberOfGuesses++;

            if (userGuess > numGen)
            {
                System.out.println("Its lower");
            } else {
                System.out.println("Its higher");
            }

        } while (userGuess != numGen);

        // getting the lowest number of tries
        if (numTries < bestNum)
        {
            bestNum = numTries;
        }

        System.out.println("You win! It took you " + numTries + " tries");
        // calls the PlayAgain method
        PlayAgain();
    }

    // this method prompts the user if they want to play again
    private static void PlayAgain()
    {
        String answer;
        System.out.print("Would you like to play again y/n? ");
        answer = input.next();

        switch (answer.toLowerCase())
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
    private static void Results()
    {
        System.out.printf("%n            *Results*%n");
        System.out.printf("_________________________________");
        System.out.printf("%nTotal games played: " + totalGames + "%n");
        System.out.println("Total guesses: " + numberOfGuesses);
        System.out.printf("Average guesses per game: %,.2f%n", numberOfGuesses/totalGames);
        System.out.printf("Best game: " + bestNum + " tries" + "%n");
    }
} // end of class
