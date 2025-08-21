package IntermediaryLevel.Refactored;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konohagakure", 16, 15, LevelNinja.GENIN);
        naruto.myBiju();

        System.out.println("--------------- Sasuke Uchiha ---------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konohagakure", 18, 20, LevelNinja.GENIN);
        sasuke.specialSkill();

        System.out.println("--------------- Itachi Uchiha ---------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Konohagakure", 27, 60, LevelNinja.JOUNIN);
        itachi.specialSkill();
        itachi.provisionalMethod();

        System.out.println("--------------- Madara Uchiha ---------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Konohagakure", 45,900, LevelNinja.KAGE);
        madara.specialSkill();
        madara.ninjaBattleStrategy();
        madara.combatIntelligence();
        madara.combatIntelligence(90);

        System.out.println("---------------");






    }
}
