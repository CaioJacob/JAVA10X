package Challenges.SixthChallenge;

import IntermediaryLevel.Ninja;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Creating a Linked List
        LinkedList<Ninjas> ninjaList = new LinkedList<Ninjas>();

        // Add ninjas
        ninjaList.add(new Ninjas("Naruto Uzumaki", 17, "Konohagakure"));
        ninjaList.add(new Ninjas("Sasuke Uchiha", 17, "Konohagakure"));
        ninjaList.add(new Ninjas("Sakura Haruno", 17, "Konoha"));
        ninjaList.add(new Ninjas("Kakashi Hatake", 31, "Konoha"));
        ninjaList.add(new Ninjas("Gaara", 17, "Sunagakure"));
        ninjaList.add(new Ninjas("Shikamaru Nara", 17, "Konohagakure"));
        ninjaList.add(new Ninjas("Temari", 18, "Sunagakure"));

        // List ninjas
        System.out.println("--------------- Ninjas ---------------");

        // Complexity o(n)
        for (Ninjas ninja : ninjaList) {
            System.out.println(ninja);
        }

        // Add First Ninja
        ninjaList.addFirst(new Ninjas("Boruto Uzumaki", 9, "Konohagakure"));

        // Remove First Ninja
        System.out.println("--------------- Removed Ninja ---------------");

        Ninjas removed = ninjaList.removeFirst();
        System.out.println("Removed Ninja: " + removed);

        // List ninjas
        System.out.println("--------------- Ninjas list after changing ---------------");

        // Complexity o(n)
        for (Ninjas updatedNinja : ninjaList) {
            System.out.println(updatedNinja);
        }

        // Look for a ninja per index
        System.out.println("--------------- Third Ninja ---------------");

        Ninjas thirdNinja = ninjaList.get(2);
        System.out.println("Third Ninja: " + thirdNinja);


    }
}

