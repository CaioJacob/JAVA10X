package IntermediaryLevel.Generics2;

public class Kunai {

    private String name;

    public Kunai(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Kunai: " + name;
    }
}
