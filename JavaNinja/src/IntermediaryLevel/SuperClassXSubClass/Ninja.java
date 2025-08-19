package IntermediaryLevel.SuperClassXSubClass;

public abstract class Ninja implements NinjaBattleStrategy {

    String name;
    String village;
    int age;

    @Override
    public void ninjaBattleStrategy(){
        System.out.println("My name is " + name + " This is the ninja Battle Strategy!");
    }

    public void specialSkill(){
        System.out.println("My name is " + name + "and this is my Special skill!");
    }

    public Ninja() {
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }
}
