package IntermediaryLevel.AbstractClassesXInterfaces;

public abstract class Ninja implements NinjaBattleStrategy {

    String name;
    String village;
    int age;

    @Override
    public void ninjaBattleStrategy(){
        System.out.println("My name is " + name + " This is the ninja Battle Strategy!");
    }

    //Abstract method - Mandatory in all classes.
    public abstract void ninjaName();

    public void specialSkill(){
        System.out.println("My name is " + name + "and this is my Special skill!");
    }

    public void throwKunai(){
        System.out.println("My name is " + name + " and I throw a Kunai");
    }

}
