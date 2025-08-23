package IntermediaryLevel.Generics2;

public class Main {
    public static void main(String[] args) {

    NinjaPouch<Object> ninjaPouch = new NinjaPouch<>();
    ninjaPouch.addWeapons(new Kunai("Explosive Kunai"));
    ninjaPouch.addWeapons(new Shuriken(3));
    ninjaPouch.addWeapons(new Scroll("Kuchiyose no Jutsu"));

        System.out.println("Weapons in my ninja pouch: ");
        ninjaPouch.showWeapons();

    }
}
