package IntermediaryLevel.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // They are static and have a reference of memory

        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // List
        // They are dynamic and size increases and decreases as needed
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // The last element that enters is necessarily the first to leave

        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuuga");
        ninjasStack.push("Kakashi Hatake");
        System.out.println("Current Stack: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Current Stack: " + ninjasStack);
        System.out.println("Current Stack with the next peek element: " + ninjasStack.peek());
        System.out.println("Stack size: " + ninjasStack.size() + " elements");



    }
}
