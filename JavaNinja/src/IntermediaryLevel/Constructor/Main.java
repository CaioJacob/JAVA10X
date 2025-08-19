package IntermediaryLevel.Constructor;

public class Main {
    public static void main(String[] args) {

    Hokages Hashirama = new Hokages();
    Hashirama.age = 45;

    Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.name);

    Hokages Hiruzen = new Hokages(77);
        System.out.println(Hiruzen.age);

    Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.name);

    }
}
