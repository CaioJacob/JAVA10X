package IntermediaryLevel.Memory;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------- Naruto Uzumaki ----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konohagakure", 16);
        System.out.println(naruto);

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.name = "Random Ninja";

        System.out.println("---------------- Sasuke Uchiha ----------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konohagakure", 18);
        System.out.println(sasuke);


    }
}
