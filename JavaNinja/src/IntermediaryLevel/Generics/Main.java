package IntermediaryLevel.Generics;


public class Main {
    public static void main(String[] args) {

    NinjaWeapons ironKunai = new NinjaWeapons("Iron Kunai");
    NinjaWeapons shuriken = new NinjaWeapons("Shuriken");
    NinjaWeapons scroll = new NinjaWeapons("Scroll");
    NinjaWeapons explosiveKunai = new NinjaWeapons("Explosive Kunai");

    GenericPouch<NinjaWeapons> genericPouch = new GenericPouch<>();
    genericPouch.addWeapons(ironKunai);
    genericPouch.addWeapons(shuriken);
    genericPouch.addWeapons(scroll);
    genericPouch.addWeapons(explosiveKunai);

        System.out.println(genericPouch);



    }
}
