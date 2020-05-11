import java.util.Scanner;
import java.util.Random;

class MainFile {
    public static void main(String[] args) {
        // AsciiChars.printUpperCaseLetters();
        AsciiChars.printNumbers();

        // AsciiChars.printUpperCaseLetters();
        AsciiChars.printLowerCaseLetters();

        // AsciiChars.printUpperCaseLetters();
        AsciiChars.printUpperCaseLetters();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:"); // Asking the user's name
        String name = scanner.nextLine();
        System.out.printf("Hello %s\n", name);
        System.out.println("Do you want to continue to the interactive part ?");
        String answer = scanner.nextLine();

        // Setting the condition for user's answer
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            System.out.println("Ok let's continue");
        } else {
            System.out.println("Goodbye please return later to continue the survey");
            // System.exit(0);
        }

        // Getting informations repeatedly from the user through the loop
        String userAnswer;
        do {
            Random rand = new Random(); // instance of random class
            int RandNum = 50;
            System.out.println("What's your Favorite Pet's name ?");
            String petName = scanner.nextLine();
            System.out.println("What's the age of your favorite pet ? Has to be a number");
            int petAge = scanner.nextInt();
            System.out.println("What's your lucky number ?");
            int luckyNumber = scanner.nextInt();
            System.out.println("Do you have a favorite quarter back ? YES OR NO");
            String quarterAnswer = scanner.nextLine();
            System.out.println("What is their Jersey Number?");
            int jerseyNum = scanner.nextInt();
            System.out.println("What's the two-digit model year of your car ? Example 18, 19, 20,");
            int modelYear = scanner.nextInt();
            System.out.println("What's the first name of your favorite Actor/ Actress ?");
            String actorName = scanner.nextLine();
            System.out.println("Enter a random number between 1 and 50");
            int RandomNum = rand.nextInt(RandNum);
            // Printing out the Ouputs
            int magicBall = jerseyNum * (RandomNum - 1);
            int magicBallBig;
            if (magicBall > 75) {
                magicBallBig = magicBall - 75;
                System.out.println("Your Magic Ball is : " + magicBallBig);
            } else {
                System.out.println("Your Magic Ball is : " + magicBall);
            }
            System.out.println("Do you want to try again?");
            userAnswer = scanner.next();
        } while (userAnswer.equalsIgnoreCase("yes"));
        // End of the loop
    }
}