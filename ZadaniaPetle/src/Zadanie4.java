import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Podaj początek zakresu: ");
        int poczatekZakresu = mojScanner.nextInt();
        System.out.println("Podaj koniec zakresu: ");
        int koniecZakresu = mojScanner.nextInt();

        if (poczatekZakresu < koniecZakresu) {
            System.out.println("Podaj dzielnik: ");
        }
        int dzielnik = mojScanner.nextInt();

        for (int i = poczatekZakresu; i < koniecZakresu; i++) {
            if (i % dzielnik == 0) {
                System.out.println(i);
            }
        }
    }
}
