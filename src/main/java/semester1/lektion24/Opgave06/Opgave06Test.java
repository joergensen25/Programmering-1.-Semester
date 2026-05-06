package main.java.semester1.lektion24.Opgave06;

import main.java.semester1.lektion24.Opgave06.Models.Spell;
import main.java.semester1.lektion24.Opgave06.Storage.SpellsStorage;

import java.util.ArrayList;

public class Opgave06Test {
    public static void main(String[] args) {
        SpellsStorage storage = new SpellsStorage();
        ArrayList<Spell> spells = storage.getSpells();
    }
}
