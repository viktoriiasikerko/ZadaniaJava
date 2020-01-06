package zadaniaoop.zadanie2;

import zadaniaoop.zadanie1.Student;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int nrIndeksu = 0;
        String imie = new String();
        String nazwisko = new String();
        char plec = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer indeksu studenta: ");

        boolean czyDaneSaPoprawne = false;
        while (!czyDaneSaPoprawne) {
            String wczytanyIndeks = scanner.nextLine();
            if (wczytanyIndeks.length() == 6) {
                try {
                    nrIndeksu = Integer.parseInt(wczytanyIndeks);
                    czyDaneSaPoprawne = true;
                } catch (NumberFormatException e) {
                    System.out.println("Podaj prawidłowy numer indeksu.");
                }
            } else {
                System.out.println("Podaj 6-cyfrowy indeks:");
            }
        }
        czyDaneSaPoprawne = false;
        System.out.println("Podaj nazwisko studenta:");
        while (!czyDaneSaPoprawne) {
            String wczytaneNazwisko = scanner.nextLine();
            if (wczytaneNazwisko.length() <= 2) {
                System.out.println("Podane nazwisko nie istnieje. Podaj prawdziwe nazwisko studenta:");
            } else {
                czyDaneSaPoprawne = true;
                nazwisko = wczytaneNazwisko;

            }
        }
        czyDaneSaPoprawne = false;
        System.out.println("Podaj imię studenta: ");
        while (!czyDaneSaPoprawne) {
            String wczytaneImie = scanner.nextLine();
            if (wczytaneImie.length() <= 2) {
                System.out.println("Podane imię prawdopodobnie nie istnieje. Podaj poprawne imię:");
            } else {
                czyDaneSaPoprawne = true;
                imie = wczytaneImie;
            }
        }
        czyDaneSaPoprawne = false;
        System.out.println("Podaj płeć:");
        while (!czyDaneSaPoprawne) {
            String wczytanaPlec = scanner.nextLine();
            if (wczytanaPlec.length() != 1 || (wczytanaPlec.charAt(0) != 'K' && wczytanaPlec.charAt(0) != 'M')) {
                System.out.println("Wpisz poprawną płeć.");
            } else {
                czyDaneSaPoprawne = true;
                plec = wczytanaPlec.charAt(0);

            }

        }
        Student student = new Student(nrIndeksu, imie, nazwisko, plec);

        System.out.println("Stworzony student: ");
        System.out.println("Indeks: " + student.getNrIndeksu());
        System.out.println("Imie: " + student.getImie());
        System.out.println("Nazwisko: " + student.getNazwisko());
        System.out.println("Płeć: " + student.getPlec());

    }
}
