import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Add variables:
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        int maximum = 9;

        // Create a randomizer that can generate numbers:

        Random randomizer = new Random();

        //Generate random numbers:

        firstDigit = randomizer.nextInt(maximum) + 1;
        secondDigit = randomizer.nextInt(maximum) + 1;
        thirdDigit = randomizer.nextInt(maximum) + 1;

        /*System.out.println("De waarde van het eerste getal is:" + firstDigit);
        System.out.println("De waarde van het tweede getal is:" + secondDigit);
        System.out.println("De waarde van het derde getal is:" + thirdDigit);*/

        // Calculate the sum and product of the input numbers given by the user.
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;

        // Print the calculation on the screen.
        System.out.println("Som:" + sumOfDigits);
        System.out.println("Product:" + productOfDigits);

        //Multiple play rounds with for loop.
        // Indiciate how many rounds to play and put the value in a variable.
        int maxTimesToPlay = 3;

        Scanner input = new Scanner(System.in);

        while(true){

        boolean hasPlayerWon = false;

        while (hasPlayerWon == false) {
            // Read the input from the user.
            System.out.println("Voer achter elkaar drie getallen in");

            int userChoice1 = input.nextInt();
            int userChoice2 = input.nextInt();
            int userChoice3 = input.nextInt();
            System.out.println("Je hebt de volgende getallen ingevuld:");
            System.out.println("Getal1:" + userChoice1);
            System.out.println("Getal2:" + userChoice2);
            System.out.println("Getal3:" + userChoice3);

            // Add win condition with if/else and create a boolean variable which will be checked by if/else

            hasPlayerWon = userChoice1 == firstDigit && userChoice2 == secondDigit && userChoice3 == thirdDigit;

            if (hasPlayerWon) {
                System.out.println("Gefeliciteerd, je hebt gewonnen");
            } else {
                System.out.println("Helaas, je hebt verloren");
            }
        }
        //Identify the scope of the for-loop in order to place an option menu within the for loop. The option menu should give the user the option to stop or continue playing.
        //Create a boolean variable which is set to true.
        boolean continuePlaying = true;

        //Ask the user if he wishes to proceed with playing.
        System.out.println("Wil je nogmaals spelen? Toets y/n");

        //Print the decision of the user.
        String continuePlayingUserChoice = input.next();

        //Make a decision based on user choice. Use the switch statement.
        switch (continuePlayingUserChoice) {
            case "y": {
                System.out.println("Je hebt ervoor gekozen nogmaals te spelen");
                continuePlaying = true;
                break;
            }
            case "n": {
                System.out.println("Je hebt ervoor gekozen om te stoppen");
                continuePlaying = false;
                break;
            }
            default: {
                System.out.println("Je hebt geen geldige waarde ingevoerd");
                break;
            }
        }
        if (continuePlaying == false) {
            break;
        }
        }
        System.out.println("Het spel is nu beeindigd");
    }
}























//Het eerste onderdeel in een stappenplan is altijd de nodige informatie verzamelen.

// De informatie van Triple Digits

// -- Welke getallen moet de speler raden?

// -- Welke informatie krijgt de speler te zien?

// -- Wat zijn de antwoorden van de speler?

//De tweede stap is het uitschrijven van het algoritme.

// Het algoritme van Triple Digits

// -- Vergelijk de te raden getallen met het gegeven antwoord

// -- Laat weten of het antwoord goed of fout is.

// -- Herhaal alle stappen met nieuwe getallen