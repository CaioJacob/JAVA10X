package IntermediaryLevel.MultipleInheritance;

import IntermediaryLevel.Uzumaki;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.village = "Konohagakure";
        sasuke.age = 18;
        sasuke.shariganActivated();

        Hatake kakashi = new Hatake();
        kakashi.name = "Kakashi Hatake";
        kakashi.village = "Konohagakure";
        kakashi.age = 48;
        kakashi.welcome();
        kakashi.shariganActivated();
        kakashi.eliteNinja();
        kakashi.hokageActivated();


    }
}
