package com.zadaniaklasyimetody;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int liczbaPierwsza;
        int liczbaDruga;
        char znak;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        liczbaPierwsza = scanner.nextInt();
        System.out.println("Podaj liczbę drugą: ");
        liczbaDruga = scanner.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciścnij /");
        System.out.println("Operacja modulo - wciśnij %");

        znak = scanner.next().charAt(0);
        switch (znak) {
            case '+': {
                System.out.println(liczbaPierwsza + "+" + liczbaDruga + "=" + liczbaPierwsza + liczbaDruga);
                break;
            }
            case '-': {
                System.out.println(liczbaPierwsza - liczbaDruga); // nie wiem dlaczego nie działają dodawanie i odejmowanie
                break;
            }
            case '*': {
                System.out.println(liczbaPierwsza + "*" + liczbaDruga + "=" + liczbaPierwsza * liczbaDruga);
                break;
            }
            case '/': {
                System.out.println(liczbaPierwsza + "/" + liczbaDruga + "=" + liczbaPierwsza/liczbaDruga);
                break;}
            case '%':{
                if(liczbaDruga!=0) {

                    System.out.println(liczbaPierwsza % liczbaDruga);
                    break;
                }else {
                    System.out.println("Nie dzielimy przez zero!");
                }
        }
    }

}
}
