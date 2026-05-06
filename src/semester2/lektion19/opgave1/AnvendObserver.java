package semester2.lektion19.opgave1;

public class AnvendObserver {
    public static void main(String[] args) {
        Saelger s1 = new Saelger("Hansen");
        Indkoeber i1 = new Indkoeber("Jensen");

        BogTitel bt1 = new BogTitel("Anders And", 6);
        BogTitel bt2 = new BogTitel("Java", 8);

        Kunde k1 = new Kunde("Læsehest1");
        Kunde k2 = new Kunde("Læsehest2");
        Kunde k3 = new Kunde("Læsehest3");

        bt1.addObserver(s1);
        bt2.addObserver(s1);


        bt1.etKoeb(k1);
        bt1.etKoeb(k2);
        bt1.etKoeb(k3);

        bt2.etKoeb(k1);
        bt2.etKoeb(k2);
        bt2.etKoeb(k3);


    }
}
