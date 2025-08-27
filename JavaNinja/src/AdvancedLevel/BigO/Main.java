package AdvancedLevel.BigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // WHAT IS AN ALGORITHM
        // Algorithm is everything!

        ArrayList<Ninjas> ninjas = new ArrayList<Ninjas>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 18));
        ninjas.add(new Ninjas("Sakura Haruno", 16));

        // Algorithm - o(1) - Constant complexity
        System.out.println(ninjas.get(1));

        System.out.println("=================================");

        // Algorithm - o(n) - Linear complexity
        for (int i = 0; i < ninjas.size(); i++) {
        System.out.println(ninjas.get(i));
        }

        System.out.println("=================================");

        // Algorithm - o(n^2) - Quadratic complexity
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + " vs " + ninjas.get(j));

            }
        }







    }
}
