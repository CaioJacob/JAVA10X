package IntermediaryLevel.Refactored;

public class Shuriken {
    private int size;

    public Shuriken(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shuriken size: " + size;
    }
}


