package IntermediaryLevel.Refactored;

public class Uzumaki extends Ninja {

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public Uzumaki(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank) {
        super(name, village, age, numberOfMissionsCompleted, rank);
    }

    public Uzumaki(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank, Biju biju) {
        super(name, village, age, numberOfMissionsCompleted, rank);
        this.biju = biju;
    }

    @Override
    public void specialSkill() {
        System.out.println("My name is " + name +" and this is my Uzumaki attack, an air attack");
    }

    public void myBiju() {
        System.out.println("My name is " + name +" and this is my biju! " + Biju.KURAMA);
    }


}
