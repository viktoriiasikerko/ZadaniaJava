package com.zadaniazobiektowosci;

public class RachunekBankowy {
    public long numerKonta;
    public double iloscSrodkowNaKoncie;
    public String imie;
    public String nazwisko;

    public RachunekBankowy() {
    }

    public long getnumerKonta() {
        return numerKonta;
    }
    public double getIloscSrodkowNaKoncie(){
        return iloscSrodkowNaKoncie;
    }
    public String getimie() {
        return imie;
    }
    public String getnazwisko() {
        return nazwisko;
    }
    public RachunekBankowy (long numerKonta, double iloscSrodkowNaKoncie, String imie, String nazwisko) {
        this.numerKonta = numerKonta;
        this.iloscSrodkowNaKoncie = iloscSrodkowNaKoncie;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przelewPrzychodzacy(RachunekBankowy andrzej, int kwotaPrzelewu) {
        this.iloscSrodkowNaKoncie += kwotaPrzelewu;
        andrzej.iloscSrodkowNaKoncie -= kwotaPrzelewu;
    }
    public void przelewWychodzacy(RachunekBankowy dorota, int kwotaPrzelewu){
        this.iloscSrodkowNaKoncie -= kwotaPrzelewu;
        dorota.iloscSrodkowNaKoncie += kwotaPrzelewu;

    }

}

