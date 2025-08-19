package IntermediaryLevel.AbstractClassesXInterfaces;

public abstract class Ninja {

    String name;
    String village;
    int age;

    public abstract void ninjaName();

    public void throwKunai(){
        System.out.println("My name is " + name + " and I throw a Kunai");
    }

}
