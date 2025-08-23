package IntermediaryLevel.Generics;

public class NinjaWeapons {

    private String name;

    public NinjaWeapons() {
    }

    public NinjaWeapons(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
