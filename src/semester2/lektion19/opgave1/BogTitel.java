package semester2.lektion19.opgave1;

import java.util.ArrayList;
import java.util.List;

public class BogTitel implements Subject{
    private String titel;
    private int antal;

    List<Kunde> kunder;
    List<Observer> observers;

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        this.kunder = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public List<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
        System.out.println("Lager opdateret: " + titel + " har nu " + this.antal + " stk.");
    }

    public void etKoeb(Kunde k) {
        if (!kunder.contains(k)) {
            kunder.add(k);
            k.addBogTitel(this);
            antal--;
        }
        notifyObservers();

    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    @Override
    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }
}
