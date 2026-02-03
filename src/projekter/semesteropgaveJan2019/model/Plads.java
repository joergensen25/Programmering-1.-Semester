package projekter.semesteropgaveJan2019.model;

public class Plads {
    private int række;
    private int nr;
    private int pris;

    public Plads(int række, int nr, int pris, Bestilling bestilling) {
        this.række = række;
        this.nr = nr;
        this.pris = pris;
        bestilling.addPlads(this);
    }

    public int getRække() {
        return række;
    }

    public int getNr() {
        return nr;
    }

    public int getPris() {
        return pris;
    }
}
