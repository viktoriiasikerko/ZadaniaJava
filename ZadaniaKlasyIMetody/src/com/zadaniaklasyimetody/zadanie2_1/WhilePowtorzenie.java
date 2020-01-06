package com.zadaniaklasyimetody.zadanie2_1;

import java.util.Scanner;

public class WhilePowtorzenie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę do 100: ");
        int liczba = in.nextInt();
        int i = 0;
        while (i < liczba) {
            i++;
            if (liczba == 0){
                break;
            }
            System.out.println(i);

        }
    }

}

