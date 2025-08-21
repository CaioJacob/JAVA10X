package IntermediaryLevel.Refactored;

public class Kunai {
    private String name;

    public Kunai(String name) {
        this.name = name;
    }

    public String getNome() {
        return name;
    }

    @Override
    public String toString() {
        return "Kunai: " + name;
    }
}
