package AdvancedLevel.Streams;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konohagakure", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konohagakure", 40));
        ninjas.add(new Ninja("Sakura Haruno", "Konohagakure", 9));
        ninjas.add(new Ninja("Kakashi Hatake", "Konohagakure", 30));
        ninjas.add(new Ninja("Gaara", "Sunahagakure", 28));
        ninjas.add(new Ninja("Temari", "Sunahagakure", 39));
        ninjas.add(new Ninja("Rock Lee", "Konohagakure", 57));

        // Ninja Filtering by Village
        ninjas.stream()
                .filter(ninja -> ninja.getVillage().equals("Sunahagakure"))
                .forEach(System.out::println); // Shortcut: "soutc"

        System.out.println("======================================");

        // Ordination
        ninjas.stream()
                .sorted((n1, n2) -> CharSequence.compare(n1.getName(), n2.getName()))
                .forEach(System.out::println);




    }
}
