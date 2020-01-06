package com.zadaniaklasyimetody.zadanie2;

import java.util.Scanner;

public class IfPowtorzenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        System.out.println("Podaj dzielnik: ");
        int dzielnik = scanner.nextInt();

            for( int i = 0; i <liczba; i++){
                if (liczba % dzielnik == 0 && i % dzielnik == 0 && i != 0){
                    System.out.println(i);

            }
        }

    }
}





