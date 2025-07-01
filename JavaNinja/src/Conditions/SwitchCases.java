package Conditions;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        /*
        SwitchCases: They are used to generate specific cases.
        Objective: Ask the user to choose between the Ninjas
         */

        // Ask the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the character: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Ask the user to choose one of the options
        int choice = scanner.nextInt();

        System.out.println("Your choice: " + choice);

        // Reaction to choosing a character
        switch (choice) {
            case 1:
                System.out.println("The user chose Ninja Uzumaki!");
                break;
            case 2:
                System.out.println("The user chose Sasuke Uchiha!");
                break;
            case 3:
                System.out.println("The user chose Sakura Haruno!");
                break;
            default:
                System.out.println("You did not enter a valid answer! Please try again.");
        }







    }
}
