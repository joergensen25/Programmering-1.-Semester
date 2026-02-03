package semester2.lektion1.opgave1;

public class Synsmand extends Mekaniker {

    private int antalSyn;

    public Synsmand(String navn, String adresse, String svendÅr, int timeløn, int antalSyn) {
        super(navn, adresse, svendÅr, timeløn);
        this.antalSyn = antalSyn;
    }

    @Override
    public int beregnLoen() {
        int ugeløn = super.beregnLoen() + antalSyn * 29;
        return ugeløn;
    }


}
