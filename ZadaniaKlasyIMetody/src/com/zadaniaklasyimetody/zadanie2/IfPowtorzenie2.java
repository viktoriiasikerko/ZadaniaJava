package com.zadaniaklasyimetody.zadanie2;

import java.util.Scanner;

public class IfPowtorzenie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int m = in.nextInt();
        System.out.println("Podaj potęgę: ");
        int n = in.nextInt();
        int potega = (int)Math.pow(m,n);
        System.out.println(m + " podniesione do potęgi " + n + " wynosi: " + potega);



    }
}
