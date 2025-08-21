package IntermediaryLevel.Refactored;

public class Parchment {
    private String content;

    public void parchment(String content) {
        this.content = content;
    }

    public String content() {
        return content;
    }

    @Override
    public String toString() {
        return "Parchment: " + content;
    }
}
