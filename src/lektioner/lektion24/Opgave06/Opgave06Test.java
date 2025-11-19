package lektioner.lektion24.Opgave06;

import lektioner.lektion24.Opgave06.Models.Spell;
import lektioner.lektion24.Opgave06.Storage.SpellsStorage;

import java.util.ArrayList;

public class Opgave06Test {
    public static void main(String[] args) {
        SpellsStorage storage = new SpellsStorage();
        ArrayList<Spell> spells = storage.getSpells();
    }
}
