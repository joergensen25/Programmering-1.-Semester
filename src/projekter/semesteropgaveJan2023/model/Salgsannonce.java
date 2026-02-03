package projekter.semesteropgaveJan2023.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salgsannonce {

    private static int antalAnnoncer = 0;

    private int annonceNummer;
    private boolean aktiv;
    private LocalDate oprettelsetdato;
    private LocalDate udløbsdato;

    private Sælger sælger;

    private ArrayList<Vare> varer = new ArrayList<>();


    public Salgsannonce salgsannonce;
}
