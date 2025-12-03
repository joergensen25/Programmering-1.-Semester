package lektioner.lektion30.opgave01;

import lektioner.lektion30.opgave01.models.*;

public class Main {

    public static void main(String[] args) {

        Barbarian fofstelr = new Barbarian("Fofstelr", 1);

        Weapon longsword = new Weapon("Longsword");

        Ranged shortbow = new Ranged("Shortbow", 80);

        fofstelr.addWeapon(longsword);
        fofstelr.addWeapon(shortbow);

        Wizard orlemaex = new Wizard("Orlemaex", 10);

        Spell fireball = new Spell(150, Duration.INSTANTANEOUS);

        orlemaex.addSpell(fireball);

        for (Weapon weapon : fofstelr.getWeapons()) {
            if (weapon instanceof Ranged ranged) {

                System.out.println(ranged.getRange());

            }
        }
    }
}
