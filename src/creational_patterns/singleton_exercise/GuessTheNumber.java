package creational_patterns.singleton_exercise;

import java.util.Random;
import java.util.Scanner;

/*
This class is okay, but would be a good use case for applying the Singleton pattern; I shouldn't be able to make
multiple GuessTheNumber instances, as I'll never want to run two games simultaneously. See if you can refactor this
class to follow the singleton pattern.
 */
public class GuessTheNumber {

    private static final GuessTheNumber instance = new GuessTheNumber();

    private GuessTheNumber() {}
    public static GuessTheNumber GetInstance(){
        return instance;
    }

    public void playGame() {
        Random generator = new Random();
        Scanner fromUser = new Scanner(System.in);
        int targetNumber = generator.nextInt(101);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        int guess;

        while(true) {
            guess = fromUser.nextInt(); //just don't give bad values :)
            if(guess == targetNumber) {
                break;
            } else {
                System.out.print("That guess is too ");
                if(guess > targetNumber) {
                    System.out.print("high");
                } else {
                    System.out.print("low");
                }
                System.out.println(" try again!");
            }
        }

        System.out.println("You got it! It was " + targetNumber + " all along!");
    }

}
