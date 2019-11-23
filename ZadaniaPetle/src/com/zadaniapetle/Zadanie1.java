package com.zadaniapetle;

public class Zadanie1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 1000; i <= 1020; i++) {
            System.out.print(i + "," + " ");
        }

        for (int i = -30; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 30; i <= 300; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int i = -300; i <= 300; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }

        for (int i = -100; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + ", ");
        }

        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.println(j);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + ", ");
            c++;
        }
        char c = 'b';
        while (c <= 'z') {
            if (c % 5 == 0) {
                System.out.print(c + ", ");
            }
            c++;
        }
    }
}