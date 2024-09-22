import java.util.*;

class Numbergame {
    public static void GuessingGame() {
        Scanner sc = new Scanner(System.in);
        int randomNumnber, guessNumber, a = 1, iterator = 0;

        // Genarating thne random number
        randomNumnber = (int) (Math.random() * 10);

        // loop for reapeating
        while (a == 1) {
            iterator++; // tells how mamy times loop repeating

            // gussing the number
            System.out.println("\t\t\t\t\t ** Guess A NUMBER FROM 1 TO 10 **  " );
            guessNumber = sc.nextInt();
            System.out.println("\n");

            // comparing the number with random number
            if (randomNumnber == guessNumber) {
                System.out.println("HURRY YOU GUESSED CORRECT NUMBER\n ");
                System.out.println("You Guessed In " + iterator + " Attempts");
                System.out.println("Your Score Is: ** " + (11 - iterator)+" **");
                a += 1;

            } else {
                System.out.println("BETTER LUCK NEXT TIME...");
                
                // tells number lower or higher
                if (randomNumnber < guessNumber) {
                    System.out.println("It's a Higher Number....");
                } else {
                    System.out.println("It's a Lower Number....");
                }
                System.out.println("You Taken " + iterator + " Attempts To Guess");

            }

        }
        sc.close();

    }

    public static void main(String[] args) {

        GuessingGame();
    }

}