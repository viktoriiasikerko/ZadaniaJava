import javax.swing.*;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        int wynik;

        Scanner iloscLiczb = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        int liczba = iloscLiczb.nextInt();
        int[] tab = new int[liczba];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbę: ");
            tab[i] = iloscLiczb.nextInt();
        }
        wynik = tab[0]; // element min
        for (int i = 1; i < tab.length; i++) {
            if (wynik > tab[i]) {
                wynik = tab[i];
            }
        }
        System.out.println("Minimalna liczba to:" + wynik);
        wynik = tab[0]; // element max
        for (int i = 1; i < tab.length; i++) {
            if (wynik < tab[i]) {
                wynik = tab[i];
            }
        }
        System.out.println("Maksymalna liczba to:"+ wynik);
    }
}
