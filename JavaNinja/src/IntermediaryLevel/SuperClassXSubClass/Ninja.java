package IntermediaryLevel.SuperClassXSubClass;

public abstract class Ninja implements NinjaBattleStrategy {


    //TODO: Include 2 new attributes: numberOfCompletedMissions, rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String name;
    String village;
    int age;
    int numberOfCompletedMissions;
    LevelNinja rank;

    public Ninja() {
    }

    // First method
    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    //TODO: Constructor overload calling the new attributes

    // Method overloading you don't need to declare the constructor, just the new attributes
    public Ninja(String name, String village, int age, int numberOfCompletedMissions, LevelNinja rank) {
        this(name, village, age);
        this.numberOfCompletedMissions = numberOfCompletedMissions;
        this.rank = rank;
    }

    @Override
    public void ninjaBattleStrategy(){
        System.out.println("My name is " + name + " This is the ninja Battle Strategy!");
    }

    public void specialSkill(){
        System.out.println("My name is " + name + "and this is my Special skill!");
    }
}
