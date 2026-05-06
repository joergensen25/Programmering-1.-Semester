package semester2.lektion19.opgave1;

public class Indkoeber implements Observer{
    String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        if (s instanceof BogTitel b) {

            if (b.getAntal() < 6) {
                System.out.println("Der skal indkøbes 10 bøger med titel: " + b.getTitel()); // Udskriver at der skal købes 10 bøger
                b.indkoebTilLager(10); // Registrerer indkøb af 10 bøger
            }

        }

    }
}
