package IntermediaryLevel.Refactored;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public Uchiha(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank) {
        super(name, village, age, numberOfMissionsCompleted, rank);
    }

    /*
    * method:
    * Implements interface Sharingan
    * */
    public void sharinganActivated() {
        System.out.println(name + ": Activated the sharingan");
    }

}
