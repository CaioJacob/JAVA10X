package IntermediaryLevel;

public class Main {
    public static void main(String[] args) {

        // Object 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Konohagakure";
        Naruto.age = 17;
        Naruto.sageModeActivated();

        // Object 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Konohagakure";
        Sasuke.age = 18;
        Sasuke.shariganActivated();

       // Object 3
        Haruno Sakura = new Haruno();
        Sakura.name = "Sakura Haruno";
        Sakura.village = "Konohagakure";
        Sakura.age = 18;
        Sakura.activateHealing();

       // Object 4
       Hyuga Hinata = new Hyuga();
       Hinata.name = "Hinata Hyuga";
       Hinata.village = "Konohagakure";
       Hinata.age = 16;
       Hinata.byakuganActivated();
    }
}
