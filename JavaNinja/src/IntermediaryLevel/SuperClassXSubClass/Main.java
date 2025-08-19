package IntermediaryLevel.SuperClassXSubClass;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.village = "Konohagakure";
        naruto.age = 16;
        naruto.ninjaBattleStrategy();
        naruto.specialSkill();


        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.village = "Konohagakure";
        sasuke.age = 18;
        sasuke.specialSkill();

       Uchiha itachi = new Uchiha("Itachi Uchiha", "Konohagakure", 27);
       itachi.specialSkill();

    }
}
