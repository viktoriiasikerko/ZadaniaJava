package com.zadaniazobiektowosci;

public class Main {

    public static void main(String[] args) {

        Samochod honda = new Samochod();
        honda.nazwa = "Honda";
        honda.predkosc = 250;
        honda.kolor = "Czarny";
        honda.wypiszInformacjeOSamochodzie();
        honda.przyspieszO5Km();
        honda.zwolnijO10Km();


        SalaLekcyjna geografia = new SalaLekcyjna();
        geografia.nazwa = "Geografii";
        geografia.numerSali = 5;
        geografia.wypiszDaneSali();

        SalaLekcyjna matematyka = new SalaLekcyjna();
        geografia.nazwa = "Matematyki";
        geografia.numerSali = 3;
        geografia.wypiszDaneSali();


        RachunekBankowy andrzej = new RachunekBankowy(456l, 5000, "Andrzej", "Kowalski");
        RachunekBankowy dorota = new RachunekBankowy(453l, 3456, "Dorota", "Jamborowicz");

        andrzej.przelewPrzychodzacy(dorota, 1234);
        System.out.println(andrzej.iloscSrodkowNaKoncie);

        dorota.przelewWychodzacy(andrzej, 500);
        System.out.println(dorota.iloscSrodkowNaKoncie);


    }
}
