package semester2.lektion1.opgave1;

public class Mekaniker extends Person{

    private String svendÅr;
    private int timeløn;

    public Mekaniker(String navn, String adresse, String svendÅr, int timeløn) {
        super(navn, adresse);
        this.svendÅr = svendÅr;
        this.timeløn = timeløn;
    }

    public String getSvendÅr() {
        return svendÅr;
    }

    public int getTimeløn() {
        return timeløn;
    }

    public void setSvendÅr(String svendÅr) {
        this.svendÅr = svendÅr;
    }

    public void setTimeløn(int timeløn) {
        this.timeløn = timeløn;
    }

    public int beregnLoen() {
        int ugeløn = 37 * timeløn;
        return ugeløn;
    }
}
