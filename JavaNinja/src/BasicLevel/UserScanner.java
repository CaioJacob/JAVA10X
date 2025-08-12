package BasicLevel;

import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {

    /*
    UserScanner is a way to bring the user into the application.
    Objective: the user will create a ninja and we will validate the data.
     */

    Scanner textBox = new Scanner(System.in);

    // Receive the name of the ninja
    System.out.print("Please enter the Ninja's name: ");
    String ninjaName = textBox.nextLine();
    System.out.println("The ninja's name is: " + ninjaName);

    // Receive the age of the ninja
    System.out.print("Please enter the Ninja's age: ");
    int ninjaAge = textBox.nextInt();
    System.out.println("The ninja's age is: " + ninjaAge);

    // Data processing
    if (ninjaAge >= 18){
        System.out.println("This ninja is already of legal age and can go on missions outside the village.");
    } else {
        System.out.println("This ninja is still very young and need to train more before leaving the village.");
    }




    // Always close the scanner
    textBox.close();

    }
}
