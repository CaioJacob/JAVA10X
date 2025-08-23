package IntermediaryLevel.Generics2;

public class Scroll {

    private String content;

    public Scroll(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Scroll: " + content;
    }
}
