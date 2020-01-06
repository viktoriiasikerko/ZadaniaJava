package com.zadaniaklasyimetody.zadanie5;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {



        Scanner podajHaslo = new Scanner(System.in);
        System.out.println("Podaj hasło:");
        String haslo = podajHaslo.nextLine();



        char[] literyUzytkownika = new char[haslo.length()];
        for (int i = 0; i < haslo.length(); i++) {
            literyUzytkownika[i] = '_';
        }
        int zycia = 5;
        boolean iloscZyc = true;
        while (iloscZyc) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj literę:");
            String wyborUzytkownika = sc.nextLine();
            char litera = wyborUzytkownika.charAt(0);

            boolean czyZawieraPodanaLitere = false;
            for (int i = 0; i < haslo.length(); i++) {
                if (litera == haslo.charAt(i)) {
                    literyUzytkownika[i] = litera;
                    czyZawieraPodanaLitere = true;
                    System.out.println("Hasło zawiera literę " + litera +"." + " Graj dalej! ");
                }
            }
            if (czyZawieraPodanaLitere == false) {
                zycia--;
                System.out.println("Nie udało Ci się. Pozostało Ci " + zycia + " żyć!");
            }
            if (zycia == 0) {
                iloscZyc = false;
                System.out.println("Nie masz więcej żyć!");
            }
        }
    }
}


