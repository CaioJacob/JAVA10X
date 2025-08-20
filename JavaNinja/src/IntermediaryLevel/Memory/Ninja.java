package IntermediaryLevel.Memory;

public abstract class Ninja {

    String name;
    String village;
    int age;

    public Ninja() {
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I live in " + village + " and I'm " + age + " years old.";
    }


}
