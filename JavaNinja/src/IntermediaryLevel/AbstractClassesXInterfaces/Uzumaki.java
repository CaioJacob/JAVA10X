package IntermediaryLevel.AbstractClassesXInterfaces;

public class Uzumaki extends Ninja implements InterfaceNinja {

    public void ninjaName() {
        System.out.println("My name is " + name);
    }


    public void throwShuriken(){
        System.out.println("I threw a shuriken!");
    }

    @Override
    public void specialSkill() {
        System.out.println("My name is " + name + " and this is my Uzumaki attack, Futon no Jutsu!");
    }


}
