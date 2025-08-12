package Challenges.ThirdChallenge;

public class Uchiha extends Ninja {

    String specialAbility = "Sharigan";

    public void showSpecialAbility(){
        super.showInformation();
        System.out.println("My Special Ability is " + specialAbility + "!");
    }

}
