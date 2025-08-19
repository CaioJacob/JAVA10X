package IntermediaryLevel.Constructor;

public class Hokages {

    String name;
    int age;
    boolean deadOrNot;
    double height;

    public Hokages() {
        //No args constructor
    }

    //Create a constructor with args
    public Hokages(String name) {
        this.name = name;
    }

    public Hokages(int age) {
        this.age = age;
    }

    // All args constructor
    public Hokages(String name, int age, boolean deadOrNot) {
        this.name = name;
        this.age = age;
        this.deadOrNot = deadOrNot;
    }

    public Hokages(double height) {
        this.height = height;
    }

    // Creating constructors with all arguments using the shortcut ctrl + N (generate)
    public Hokages(String name, int age, boolean deadOrNot, double height) {
        this.name = name;
        this.age = age;
        this.deadOrNot = deadOrNot;
        this.height = height;
    }
}
