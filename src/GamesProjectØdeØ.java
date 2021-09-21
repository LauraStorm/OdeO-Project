import java.util.Scanner;

public class GamesProjectØdeØ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INTRO for user
        System.out.println("Imagine that you are on a desert Island 🏝  and you can only bring 1 thing with you!");
        System.out.println("Which of the following items would you choose to bring with you?\n");


        // 10 options for user to choose
        String [] options = {"1. Your bed", "2. A TV", "3. Music", "4. A Friend", "5. Coffee machine", "6. Alcohol", "7. A pet", "8. Your favorite dish", "9. Your wardrobe ", "10. Your mom"};
        int[] optionIndex = new int[10];


        //Print option for user
        for (String option : options) {
            System.out.println(option);
        }


        //Get 10 user inputs - they choose one option each
        for (int i = 1; i <= options.length; i++) {
            System.out.println("Type the number of your choice:");
            int userInputs = scanner.nextInt();
            System.out.println(i + ". Answer\n--------------------------------");

            optionIndex[userInputs-1] = optionIndex[userInputs-1] + 1;

            if ( userInputs > options.length){
                System.out.println("Your choice is not available");
            }
        }


       // Result from user input
        for (int option : optionIndex) {
            System.out.print(option + ", ");
        }


        //Find the most popular option
        int maximum = optionIndex[0];
        int mostChosenElement = 0;

        for (int i = 0; i < options.length; i++) {
            int currentElement = optionIndex[i];

            if (currentElement > maximum){
                maximum = currentElement;
                mostChosenElement = i;
            }
        }

        //If there is more than one item there is popular (has the same amount of votes) - show both/all element there has the same amount of votes
        String moreThan2ChosenElement = "";
        int mostChosenValuesIndex = optionIndex[mostChosenElement];

        for (int i = 0; i < options.length; i++) {
            if (mostChosenValuesIndex == optionIndex[i]){
                moreThan2ChosenElement += options[i] + ", ";
            }
        }
        System.out.println("\n" + moreThan2ChosenElement + "is the most frequent item(s) that the users would bring to a desert island 🏝 ");

    }

}
