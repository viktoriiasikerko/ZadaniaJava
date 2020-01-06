package com.zadaniaklasyimetody.zadanie3;

import static com.zadaniaklasyimetody.zadanie3.Zadanie3b.rand;

public class Main {
    public static void main(String[] args) {
        int min = 1, max = 100;

        System.out.println("Losowa liczba z przedziału od 1 do 100 to: " + rand(min, max));
    }
}
