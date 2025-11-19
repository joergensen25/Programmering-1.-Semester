package ekstraPRO.lektion6.eksamensopgave2023.model;

public class Vare {
    private Varekategori kategori;
    private String navn;
    private int udbudspris;
    private boolean solgt;

    // associering Vare --> 0..1 SalgsAnnonce
    private Salgsannonce salgsannonce;

    public Vare(Varekategori kategori, String navn, int udbudspris) {
        this.kategori = kategori;
        this.navn = navn;
        this.udbudspris = udbudspris;
        this.solgt = false;
    }

    public Varekategori getKategori() {
        return kategori;
    }

    public String getNavn() {
        return navn;
    }

    public int getUdbudspris() {
        return udbudspris;
    }

    public boolean isSolgt() {
        return solgt;
    }

    public void setSolgt(boolean solgt) {
        this.solgt = solgt;
    }

    @Override
    public String toString() {
        return navn + " " + udbudspris + " " + (solgt ? "solgt" : "til salg");
    }

    //-----------------------------------------------------

    // getSalgsannonce() metode
    public Salgsannonce getSalgsannonce() {
        return salgsannonce;
    }

    // setSalgsannonce() metode
    public void setSalgsannonce(Salgsannonce salgsannonce) {
        if (this.salgsannonce != salgsannonce) {
            Salgsannonce oldSalgsannonce = this.salgsannonce;
            if (oldSalgsannonce != null) {
                oldSalgsannonce.removeVare(this);
            }
            this.salgsannonce = salgsannonce; // Vare --> Salgsannonce
            if (salgsannonce != null) {
                salgsannonce.addVare(this); // Salgsannonce --> Vare
            }
        }
    }
}
