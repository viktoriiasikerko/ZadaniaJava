
package com.zadaniazobiektowosci;
public class SalaLekcyjna {
    public String nazwa;
    public int numerSali;

    public SalaLekcyjna() {
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public SalaLekcyjna (String nazwa, int numerSali){
        this.nazwa = nazwa;
        this.numerSali = numerSali;
    }
    public void wypiszDaneSali(){
        System.out.println("To jest sala " + nazwa);
        System.out.println("Numer sali to: " + numerSali);
    }
}

