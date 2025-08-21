package IntermediaryLevel.SuperClassXSubClass;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public Uzumaki(String name, String village, int age, int numberOfCompletedMissions, LevelNinja rank) {
        super(name, village, age, numberOfCompletedMissions, rank);
    }

    @Override
    public void specialSkill(){
        System.out.println("My name is " + name + "and I am an Uzumaki, this is my Special skill!");
    }

}
