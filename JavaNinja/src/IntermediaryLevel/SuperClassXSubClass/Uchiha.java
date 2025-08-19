package IntermediaryLevel.SuperClassXSubClass;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    @Override
    public void specialSkill(){
        System.out.println("My name is " + name + "and I am an Uchiha, this is my Special skill!");
    }

}
