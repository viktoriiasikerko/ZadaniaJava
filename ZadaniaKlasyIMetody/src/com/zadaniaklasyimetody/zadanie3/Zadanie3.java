package com.zadaniaklasyimetody.zadanie3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę maksymalną: ");
        int liczba = in.nextInt();

        Random rand = new Random();
        int a = rand.nextInt(liczba);
        System.out.println(a);


    }
}
