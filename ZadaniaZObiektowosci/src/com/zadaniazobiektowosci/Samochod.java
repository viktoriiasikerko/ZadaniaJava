package com.zadaniazobiektowosci;
public class Samochod {

public String nazwa;
public int predkosc;
public String kolor;

    public Samochod() {

    }
    
    public String getNazwa() {
        return nazwa;
        }

public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
        }
public Samochod(String nazwa, int predkosc, String kolor) {
        this.predkosc = predkosc;
        this.kolor = kolor;
        }
public void wypiszInformacjeOSamochodzie() {
        System.out.println("Nazwa to: " + nazwa);
        System.out.println("Prędkość samochodu: " + predkosc);
        System.out.println("Kolor samochodu: " + kolor);
        }
public void przyspieszO5Km() {
        System.out.println(predkosc + 5);
        }
public void zwolnijO10Km() {
        System.out.println(predkosc - 10);
        }

        }
