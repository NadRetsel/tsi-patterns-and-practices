package creational_patterns.dependencyinjection_exercise;

import java.util.Random;
import java.util.Scanner;


public class GuessTheNumberSetterInjection {

    private static final GuessTheNumberSetterInjection instance = new GuessTheNumberSetterInjection();
    private Random generator;
    private Scanner fromUser;
    private int targetNumber;

    private GuessTheNumberSetterInjection() {
    }
    public static GuessTheNumberSetterInjection GetInstance(){
        return instance;
    }

    public void SetGenerator(Random generator){
        this.generator = generator;
    }
    public void SetFromUser(Scanner fromUser){
        this.fromUser = new Scanner(System.in);

    }
    public void SetTargetNumber(Random generator){
        this.targetNumber = generator.nextInt();

    }

    public void playGame() {
        //Random generator = new Random();
        //Scanner fromUser = new Scanner(System.in);
        //int targetNumber = generator.nextInt(101);
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
