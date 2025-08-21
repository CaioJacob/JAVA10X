package IntermediaryLevel.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // It is static, do not change in size
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printing array = " + ninjasArray[0]);


        // Lists
        // They are not static, they can be changed
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        // Add to the list
        ninjasList.add("Kakashi Hatake");

        System.out.println("Printing list = " + ninjasList);

        // Remove to the list
        ninjasList.remove("Kakashi Hatake");

        System.out.println("Printing list = " + ninjasList);

        // Changing the element
        ninjasList.set(3, "Hashirama Senju");

        System.out.println("Printing list = " + ninjasList);

        // See the size of the list
        System.out.println("List size is: " + ninjasList.size() + " elements");

    }
}
