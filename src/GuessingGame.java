import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    Scanner input = new Scanner(System.in);

    public static void main(String [] args)
    {
        Intro();
        random();
        //Game();
        //PlayAgain();
        //Results();
    }

    // intro for the game and how the game is played
    public static void Intro()
    {
        System.out.printf("This program allows you to play a guessing game.");
        System.out.printf("%nI will think of a number between 1 and");
        System.out.printf("%n100 and will allow you to guess until");
        System.out.printf("%nyou get it. For each guess, I will tell you");
        System.out.printf("%nwhether the right answer is higher or lower");
        System.out.printf("%nthan your guess.");
    }

    private static final Random numGen = new Random();
    public static void random() {

    }

    // the method for the game (main code)
    public static void Game() {

    }

    // this method prompts the user if they want to play again
    public static void PlayAgain() {

    }

    // this method will display the results of the game played
    public static void Results() {

    }

}
