import java.util.Scanner;

public class GamesProjectØdeØ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INTRO for user:
        System.out.println("Imagine that you are on a desert Island 🏝  and you can only bring 1 thing with you");
        System.out.println("I made a list. Which of these items would you choose?");

        // 10 options for user to choose:
        String [] options = {"1. Tent", "2. Madras", "3. Music", "4. A Friend", "5. Matches", "6. Knife", "7. Book", "8. A pet", "9. Food", "10. coffee"};

        //print option til user
        for (String option : options) {
            System.out.println(option);
        }

        //Get 10 user inputs - they choose one option each
        System.out.println("Type the number of your choice:");
        //Denne kan ændres til en while loop - hvis der er tid.****
        //while gør at vi kan få 10 input også hvis man svarer forker*****

        for (int i = 1; i <= options.length; i++) {
            int userInputs = scanner.nextInt();
            System.out.println(i);

            if ( userInputs > options.length){
                System.out.println("Your choice is not available");
            }
        }

        //Get userInputs in an array







    }
}
