package Challenges;

import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int NUMBER_MAX = 10;
        String ninja[] = new String[NUMBER_MAX];

        int registeredNinjas = 0;
        int option = 0;

        while (option != 4) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Register Ninja");
            System.out.println("2. List Ninjas");
            System.out.println("3. Delete Ninja");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    if (registeredNinjas < NUMBER_MAX) {
                        System.out.println("Enter the name of the ninja you want to register:");
                        String ninjaName = sc.nextLine();
                        ninja[registeredNinjas] = ninjaName;
                        registeredNinjas++;
                        System.out.println("Ninja has been registered successfully.");
                    } else {
                        System.out.println("The ninja list is already full.");
                    }
                    break;
                case 2:
                    if (registeredNinjas == 0)  {
                        System.out.println("No ninjas were registered!");
                    }else {
                        System.out.println("These are all the ninjas already registered:");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println(ninja[i]);
                        }
                    }
                    break;
                case 3:
                    if (registeredNinjas == 0)  {
                        System.out.println("No ninjas to be deleted!");
                    }else {
                        registeredNinjas--;
                        ninja[registeredNinjas] = null;
                        System.out.println("Ninja has been deleted successfully.");
                    }
                case 4:
                    System.out.println("You have exited the menu!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }


        }
        sc.close();
    }
}
