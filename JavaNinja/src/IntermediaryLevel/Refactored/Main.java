package IntermediaryLevel.Refactored;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konohagakure", 16, 15, LevelNinja.GENIN);
        naruto.minhaBiju();

        System.out.println("--------------- Sasuke Uchiha ---------------");

        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Konohagakure", 18, 20, LevelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("--------------- Itachi Uchiha ---------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Konohagakure", 27, 60, LevelNinja.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        System.out.println("--------------- Madara Uchiha ---------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Konohagakure", 45,900, LevelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(90);

        System.out.println("---------------");






    }
}
