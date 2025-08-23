package IntermediaryLevel.Generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinjaPouch<T> {

    // Initialize the array
    private List<T> weapons;

    // Constructor
    public NinjaPouch() {
        this.weapons = new ArrayList<>();
    }

    // Put the weapons in the Array
    public void addWeapons(T weapon) {
        weapons.add(weapon);
    }

    // Show the weapon list
    public void showWeapons() {
        for (T weapon : weapons) {
            System.out.println(weapon);
        }
    }


}
