package semester2.lektion3.opgave1;

public class Chili implements Measurable{

    private String navn;
    private double styrke;

    public Chili(String navn, double styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public double getStyrke() {
        return styrke;
    }

    @Override
    public double getMeasure() {
        return styrke;
    }
}
