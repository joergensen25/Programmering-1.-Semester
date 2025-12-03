package lektioner.lektion30.opgave01.models;

import java.util.ArrayList;

public class Spellcaster extends Character {

    private ArrayList<Spell> spells = new ArrayList<>();

    public Spellcaster(String name, int level) {
        super(name, level);
    }

    public void addSpell(Spell spell) {
        spells.add(spell);
    }

}
