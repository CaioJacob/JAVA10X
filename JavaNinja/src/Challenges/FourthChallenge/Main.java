package Challenges.FourthChallenge;

public class Main {
    public static void main(String[] args) {


        Ninja ninja1 = new BasicNinja("Naruto Uzumaki",16,"Bushin no Jutsu");
        Ninja ninja2 = new AdvancedNinja("Kakashi Hatake", 26,"Raikiri", "Raiton");

        Ninja[] ninjas = {ninja1, ninja2};

        for (Ninja ninja : ninjas) {
            ninja.showInformations();
            ninja.peformSkill();
            System.out.println("-------------------------------------------------");
        }

    }
}
