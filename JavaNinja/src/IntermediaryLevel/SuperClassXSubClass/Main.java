package IntermediaryLevel.SuperClassXSubClass;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.village = "Konohagakure";
        naruto.age = 16;
        naruto.ninjaBattleStrategy();
        naruto.specialSkill();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konohagakure", 18, 20, LevelNinja.GENIN);
        sasuke.specialSkill();

       Uchiha itachi = new Uchiha("Itachi Uchiha", "Konohagakure", 27);
       itachi.specialSkill();

       Uchiha madara = new Uchiha("Madara Uchiha", "Konohagakure", 45, 900, LevelNinja.KAGE);
       madara.specialSkill();
       madara.ninjaBattleStrategy();
    }
}
