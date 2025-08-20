package IntermediaryLevel.SuperClassXSubClass;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konohagakure", 16, 10, LevelNinja.GENIN);

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konohagakure", 18, 20, LevelNinja.GENIN);
        sasuke.specialSkill();

       Uchiha itachi = new Uchiha("Itachi Uchiha", "Konohagakure", 27, 500, LevelNinja.JONIN);
       itachi.specialSkill();

       Uchiha madara = new Uchiha("Madara Uchiha", "Konohagakure", 45, 900, LevelNinja.KAGE);
       madara.specialSkill();
       madara.ninjaBattleStrategy();
       madara.combatIntelligence();
       madara.combatIntelligence(90);
    }
}
