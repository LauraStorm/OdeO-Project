import java.util.Scanner;

public class GamesProjectØdeØ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INTRO for user:
        System.out.println("Imagine that you are on a desert Island 🏝  and you can only bring 1 thing with you");
        System.out.println("I made a list. Which of these items would you choose?");

        // 10 options for user to choose:
        String [] options = {"1. Tent", "2. Madras", "3. Music", "4. A Friend", "5. Matches", "6. Knife", "7. Book", "8. A pet", "9. Food", "10. coffee"};
        int[] optionIndex = new int[10];

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

            optionIndex[userInputs-1] = optionIndex[userInputs-1] + 1;

            if ( userInputs > options.length){
                System.out.println("Your choice is not available");
            }
        }

       // User input in an array
        for (int option : optionIndex) {
            System.out.print(option + ", ");
        }

        //Find most popular option
        int maximum = optionIndex[0];
        int mostChosenElement = 0;

        for (int i = 0; i < options.length; i++) {
            int currentElement = optionIndex[i];

            if (currentElement > maximum){
                maximum = currentElement;
                mostChosenElement = i;
            }
        }

        //If there is more than one items there is popular (has the same votes) - show both/all element there has the same amount of votes
        String moreThan2ChosenElement = "";
        int mostChosenValuesIndex = optionIndex[mostChosenElement];

        for (int i = 0; i < options.length; i++) {
            if (mostChosenValuesIndex == optionIndex[i]){
                moreThan2ChosenElement += options[i] + ", ";
            }
        }
        System.out.println("\n" + moreThan2ChosenElement + "is the most frequent item(s) that was chosen");










    }
}
