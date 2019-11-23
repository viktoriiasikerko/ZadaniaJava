import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int podanaLiczba = mojScanner.nextInt();

        while (podanaLiczba > 0) {
            System.out.println("Hello world");
            podanaLiczba++;
        }
        if (podanaLiczba == 0) {
            System.out.println("Koniec.");
        }
    }
}
