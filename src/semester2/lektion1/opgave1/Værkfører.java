package semester2.lektion1.opgave1;

public class Værkfører extends Mekaniker{

    private String værkførerÅr;
    private int lønTillæg;


    public Værkfører(String navn, String adresse, String svendÅr, int timeløn, String værkførerÅr, int lønTillæg) {
        super(navn, adresse, svendÅr, timeløn);
        this.værkførerÅr = værkførerÅr;
        this.lønTillæg = lønTillæg;
    }

    public String getVærkførerÅr() {
        return værkførerÅr;
    }

    public int getLønTillæg() {
        return lønTillæg;
    }

    public void setVærkførerÅr(String værkførerÅr) {
        this.værkførerÅr = værkførerÅr;
    }

    public void setLønTillæg(int lønTillæg) {
        this.lønTillæg = lønTillæg;
    }

    @Override
    public int beregnLoen() {
        int ugeløn = super.beregnLoen() + lønTillæg;
        return ugeløn;
    }
}
