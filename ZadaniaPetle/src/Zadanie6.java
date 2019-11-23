import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner odczytLiczby = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int podanaLiczba = odczytLiczby.nextInt();

        int i = 1;
        while (i <= podanaLiczba) {
            System.out.println(i);
            i *= 2;
        }
    }
}
