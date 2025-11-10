package ekstraPRO.lektion3.model;

public class Lejer {
    private String navn;
    private String uddannelse;

    public Lejer(String navn, String uddannelse) {
        this.navn = navn;
        this.uddannelse = uddannelse;
    }

    public String getNavn() {
        return navn;
    }

    public String getUddannelse() {
        return uddannelse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setUddannelse(String uddannelse) {
        this.uddannelse = uddannelse;
    }
}
