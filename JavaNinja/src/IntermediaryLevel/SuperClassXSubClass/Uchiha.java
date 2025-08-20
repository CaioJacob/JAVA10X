package IntermediaryLevel.SuperClassXSubClass;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public Uchiha(String name, String village, int age, int numberOfCompletedMissions, LevelNinja rank) {
        super(name, village, age, numberOfCompletedMissions, rank);
    }

    @Override
    public void specialSkill(){
        System.out.println("My name is " + name + "and I am an Uchiha, this is my Special skill. I have already completed: " + numberOfCompletedMissions + " mission(s)");
    }

}
