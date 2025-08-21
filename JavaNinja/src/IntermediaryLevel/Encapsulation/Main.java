package IntermediaryLevel.Encapsulation;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Konohagakure", 17, 30, 1.67);
        System.out.println("My name is: " + naruto.getName());
        naruto.setName("Naruto Uzumaki (altered name)");
        System.out.println("My name is: " + naruto.getName());



        System.out.println("--------------- Sasuke Uchiha ---------------");


        Missions mission1 = new Missions("Rescue dog", MissionsRank.D);
        mission1.displayDetails();

        Missions mission2 = new Missions("Defeat Zabuza", MissionsRank.A);
        mission2.displayDetails();






    }
}
