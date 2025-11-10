package ekstraPRO.lektion3.test;

import ekstraPRO.lektion3.model.Bolig;
import ekstraPRO.lektion3.model.Kollegie;
import ekstraPRO.lektion3.model.Lejeaftale;

import java.time.LocalDate;

public class Opg4App {
    public static void main(String[] args) {
        Kollegie kollegie = new Kollegie("A-huset", "Bygaden 1, Byen");
        System.out.println("kollegie = " + kollegie.getNavn());

        // bolig1
        Bolig bolig1 = new Bolig(25, "Landevejen 2 Byen", 2000);
        System.out.println("bolig1 = " + bolig1.getAdresse());

        kollegie.addBolig(bolig1);

        System.out.println(kollegie.getBoliger());

        // bolig2
        Bolig bolig2 = new Bolig(20, "Bygaden 2 Byen", 1500);
        kollegie.addBolig(bolig2);
        System.out.println(kollegie.getBoliger());

        // bolig3
        kollegie.createBolig(15, "Bygaden 3 Byen", 1000);

        // afsluttet lejeaftale på bolig1
        Lejeaftale lejeaftale1 = bolig1.createLejeaftale(LocalDate.parse("2025-11-01"));
        lejeaftale1.setTilDato(LocalDate.of(2026, 6, 1));


        // uafsluttet lejeaftale på bolig1

        // afsluttet lejeaftale på bolig2

        // uafsluttet lejeaftale på bolig2

        // brug metoden getAntalLejeAftaler()

        // brug metoden gennemsnitligAntalDage()

    }
}
