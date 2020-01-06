package com.zadaniaklasyimetody.zadanie4;

public class Zadanie4a {


    public static void main(String[] args) {
        int[] tab = new int[]{0, 2, 37, 4, 51, -7, 74, 8, 9, 110};
        int wynik = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (wynik > tab[i]) {
                wynik = tab[i];
            }
        }
        System.out.println("Najmniejszy element tablicy to: " + wynik);

        wynik = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (wynik < tab[i]) {
                wynik = tab[i];

            }
        }
        System.out.println("Największy element tablicy to: " + wynik);

        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = tab[i] + suma;
        }

        double avg = (double) suma / 10;
        System.out.println("Średnia arytmetyczna: " + avg);

        System.out.println("Rozmiar tablicy to: " + tab.length);
        }
    }


