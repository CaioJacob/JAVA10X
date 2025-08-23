package IntermediaryLevel.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericPouch<T> {

    private List<T> weapons;

    public GenericPouch() {
        this.weapons = new ArrayList<>();
    }

    // Add generic weapons
    public void addWeapons(T genericWeapon) {
        weapons.add(genericWeapon);
    }


    public List<T> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<T> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Weapons Pouch: " + weapons.toString();
    }

}
